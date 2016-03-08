package lukelunix.ntnumple.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 24.02.2016.
 */
public class Popup extends Activity implements View.OnClickListener {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private TextView popupText;

    private TodoListActivity todolistclass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);

        todolistclass =  TodoListActivity.getTodoLIst();

        //Initialize radiobuttons
        rb1 = (RadioButton)findViewById(R.id.radioButtonFreshman);
        rb2 = (RadioButton)findViewById(R.id.radioButtonSophomore);
        rb3 = (RadioButton)findViewById(R.id.radioButtonJunior);

        popupText = (TextView)findViewById(R.id.textPopup);
        popupText.setText("Hi and welcome to your To-Do List!" +"\n \n" +
                "By choosing which year, there will be added a customized list of tasks according to the year you are studing. " +
                "The tasks are to help you remember what could be important." +"\n \n"+
                "If you do not want to use this, just click outside the popup window!" + "\n");


        //Set onClickListeners to radio buttons
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);

        //Settup popup window height and widht
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int) (height*.65));


    }

    @Override
    public void onClick(View v) {

        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.radioButtonFreshman:
                if(checked){
                    todolistclass.addTasksByRadioButton(1);
                    finish();
                }
                break;
            case R.id.radioButtonSophomore:
                if(checked){
                    todolistclass.addTasksByRadioButton(2);
                    finish();
                }
                break;
            case R.id.radioButtonJunior:
                if(checked){
                    todolistclass.addTasksByRadioButton(3);
                    finish();
                }
                break;
        }
    }
}
