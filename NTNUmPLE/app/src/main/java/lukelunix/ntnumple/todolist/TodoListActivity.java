package lukelunix.ntnumple.todolist;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;



import org.apache.commons.io.FileUtils;
import android.graphics.Paint;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import lukelunix.ntnumple.R;

public class TodoListActivity extends SwipeListViewActivity implements View.OnClickListener, View.OnKeyListener{

    //Declare To-do List activity variables
    private EditText editTextItem;
    private Button buttonAddItem;
    private ListView listItems;

    private ArrayList<String> todolist;
    private ArrayAdapter<String> arrayAdapter;


    private ListView mListView;
    private ArrayAdapter<String> mAdapter;

    @Override
    public ListView getListView() {
        return listItems;
    }

    @Override
    public void getSwipeItem(boolean isRight, int position) {

    }

    @Override
    public void onItemClickListener(ListAdapter adapter, int position) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        //Read items from todo file (if there is something saved from before)
        readItems();

        //Initialize To-do List variables
        editTextItem = (EditText)findViewById(R.id.editText);
        buttonAddItem = (Button)findViewById(R.id.buttonAdd);
        listItems = (ListView)findViewById(R.id.listView);

        //Add OnClickListeners to button and textfield
        buttonAddItem.setOnClickListener(this);
        editTextItem.setOnKeyListener(this);
        setupListViewListener();

        //Initialize and set Array Adapter
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todolist);
        listItems.setAdapter(arrayAdapter);

    }

    //Adds a Long Click Listener to the list
    private void setupListViewListener() {
        listItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //Remove the item within the arraylist at the position
                todolist.remove(position);
                //Write to-do file
                writeItems();
                //Refresh the adapter after changes*/
                arrayAdapter.notifyDataSetChanged();
                // Return true to mark it as handeled

                return true;
            }
        });
    }


    // Read items from "todo.txt" file
    // If there are items add to list, if not catch ioexception
    private void readItems() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        try {
            todolist = new ArrayList<String>(FileUtils.readLines(todoFile));
        } catch (IOException e) {
            todolist = new ArrayList<String>();
        }
    }

    // Write items to "todo.txt" file
    // If there are items add to file, if not catch ioexception
    private void writeItems() {
        File filesDir = getFilesDir();
        File todoFile = new File(filesDir, "todo.txt");
        try {
            FileUtils.writeLines(todoFile, todolist);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Add Item to To-do list function
    private void addItem(String item){
        if(item.length() >0){
            this.todolist.add(item);
            this.arrayAdapter.notifyDataSetChanged();
            this.editTextItem.setText("");
            //Adds to todo file
            writeItems();
        }
    }

    //Add Item OnClick Function for to-do list Button
    @Override
    public void onClick(View v) {
        if(v == this.buttonAddItem ){
            this.addItem(this.editTextItem.getText().toString());
        }
    }

    //Add Item On Click Function for to-do list KeyButtons
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if(event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DPAD_CENTER){
            this.addItem(this.editTextItem.getText().toString());
            //Adds to todo file
            writeItems();
        }
        return false;
    }
}
