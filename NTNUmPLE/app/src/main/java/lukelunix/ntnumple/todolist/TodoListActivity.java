package lukelunix.ntnumple.todolist;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.mainmenu.MainActivity;

public class TodoListActivity extends AppCompatActivity implements View.OnClickListener, View.OnKeyListener,
        AdapterView.OnItemClickListener{

    //Declare To-do List activity variables
    private EditText editTextItem;
    private Button buttonAddItem;
    private ListView listItems;
    private TaskAdapter arrayAdapter;
    private ArrayList<String> strikeThroughText;

    // File path for TodoTasks and Done Tasks
    private String taskFile = "todotasks.txt";
    private String doneTaskFile = "donetasks.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        //Initialize To-do List variables
        editTextItem = (EditText)findViewById(R.id.editText);
        buttonAddItem = (Button)findViewById(R.id.buttonAdd);
        listItems = (ListView)findViewById(R.id.listView);

        arrayAdapter = null;
        strikeThroughText = new ArrayList<String>();

        //Read items from todotask file and donetasks (if there is something saved from before)
        readStrikeThroughItems();
        readItemsFromFile();

        //Add OnClickListeners to button and textfield
        buttonAddItem.setOnClickListener(this);
        editTextItem.setOnKeyListener(this);
        setupListViewListener();

        //Add ArrayAdapter and OnItemClickListener to ListView
        listItems.setAdapter(arrayAdapter);
        listItems.setOnItemClickListener(this);

        //Add home menu button to actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.rsz_homeicon);
    }

    //Return to Main Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
        }
        return (super.onOptionsItemSelected(menuItem));
    }



    // Read items from "todotasks.txt" file
    // If there are items add to list, if not catch ioexception
    private void readItemsFromFile() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, taskFile);

        try {
            arrayAdapter = new TaskAdapter(this, new ArrayList<Task>());
            ArrayList<String> list = new ArrayList<String>();

            Scanner s = new Scanner(todoFile);
            while (s.hasNextLine()){
                list.add(s.nextLine());
            }
            s.close();

            //Arraylist is saved reverse. This will reverse it to the correct representation
            Collections.reverse(list);

            //Add all tasks from file
            for (int i = 0; i<list.size(); i++) {
                addItemFromFile(list.get(i));
            }

        } catch (IOException e) {
            arrayAdapter = new TaskAdapter(this, new ArrayList<Task>());
        }
    }

    //Write files to file
    //If there are tasks, write to file, if not catch ioexception
    private void writeFilesToFile() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, taskFile);

        try {
            FileUtils.writeLines(todoFile, arrayAdapter.getList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Write done tasks to file. This is to help validate which task are done when returning to the app.
    //This can also be used as a history if you regret deleting. (Have to implement this)
    //Write the arraylist strikeThroughText to file, if nothing to write, catch ioexpection
    private void writeStrikeThroughItem() {

        File filesDir = getFilesDir();
        File strikeTextFile = new File(filesDir, doneTaskFile);
        try {
            FileUtils.writeLines(strikeTextFile, strikeThroughText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Read done tasks from file.
    //If there are tasks read them and set them to arraylist. If not catch ioexception
    private void readStrikeThroughItems() {
        File filesDir = getFilesDir();
        File strikeTextFile = new File(filesDir, doneTaskFile);

        try {
            strikeThroughText = new ArrayList<String>(FileUtils.readLines(strikeTextFile));
            //Arraylist is stored reverse. This reverses it again to fix the representation
            Collections.reverse(strikeThroughText);
        } catch (IOException e) {
            strikeThroughText = new ArrayList<String>();
        }
    }

    //Add Item to To-do list from file
    private void addItemFromFile(String item){
        if(item.length() >0){
            Task t = new Task();
            t.setTaskDescription(item);

            //Check through done tasks to strikethrough text or not
            if(strikeThroughText != null){
                for(int i= 0; i<strikeThroughText.size(); i++){
                    if(strikeThroughText.get(i).equals(item) ){
                        t.setDone(true);
                    }

                }
            }
            else {
                t.setDone(false);
            }
            this.arrayAdapter.insert(t, 0);
            this.editTextItem.setText("");
        }
    }

    //Add Item to To-do list function
    private void addItem(String item){
        if(item.length() >0){
            item = item.replaceAll("\\r|\\n", " ");
            Task t = new Task();
            t.setTaskDescription(item);
            t.setDone(false);
            this.arrayAdapter.insert(t, 0);
            this.editTextItem.setText("");
        }
    }


    //Add Item OnClick Function for to-do list Button
    @Override
    public void onClick(View v) {
        if(v == this.buttonAddItem ){
            this.addItem(this.editTextItem.getText().toString());
            //Write tasks to file
            writeFilesToFile();
        }
    }

    //Add Item On Click Function for to-do list KeyButtons
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if(event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DPAD_CENTER){
            this.addItem(this.editTextItem.getText().toString());
        }
        return false;
    }


    //On item click get item and add Strikethrough or remove Strikethrought from text
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Task task = arrayAdapter.getItem(position);
        TextView taskDescription = (TextView) view.findViewById(R.id.task_description);

        task.setDone(!task.isDone());

        //Check if task is done. If true add strikethrough, if not remove strikethrough
        if(task.isDone()){
            taskDescription.setPaintFlags(taskDescription.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            strikeThroughText.add(arrayAdapter.getItem(position).toString());
            //Write to file that task is done
            writeStrikeThroughItem();
        }else{
            taskDescription.setPaintFlags(taskDescription.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
            strikeThroughText.remove(arrayAdapter.getItem(position).toString());
            //Write to file that task is not done
            writeStrikeThroughItem();
        }

    }


    //Adds a Long Click Listener to the listview
    private void setupListViewListener() {
        listItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                //If item is removed check if item is in done task (Strikethrough list)
                if(strikeThroughText != null) {
                    for (int i = 0; i < strikeThroughText.size(); i++) {
                        if (strikeThroughText.get(i).equals(arrayAdapter.getItem(position).toString())) {
                            strikeThroughText.remove(arrayAdapter.getItem(position).toString());
                            //Write to file that task is removed
                            writeStrikeThroughItem();
                        }
                    }
                }
                //Remove the item within the arraylist at the position
                arrayAdapter.removeTask(position);

                //Write to-do file that task is removed
                writeFilesToFile();

                //Refresh the adapter after changes
                arrayAdapter.notifyDataSetChanged();

                // Return true to mark it as handeled
                return true;
            }
        });
    }
}
