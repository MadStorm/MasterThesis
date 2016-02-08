package lukelunix.ntnumple.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.coursehelp.CourseInfoMenuActivity;
import lukelunix.ntnumple.contact.FacilityInfoActivity;
import lukelunix.ntnumple.todolist.TodoListActivity;
import lukelunix.ntnumple.links.ToolsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Main menu buttons
    private ImageButton coursehelp;
    private ImageButton facilitinfo;
    private ImageButton todolist;
    private ImageButton tools;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        coursehelp = (ImageButton)findViewById(R.id.imageButtonCourseHelp);
        coursehelp.setOnClickListener(this);
        facilitinfo = (ImageButton)findViewById(R.id.imageButtonFacilityInfo);
        facilitinfo.setOnClickListener(this);
        todolist = (ImageButton)findViewById(R.id.imageButtonTodoList);
        todolist.setOnClickListener(this);
        tools = (ImageButton)findViewById(R.id.imageButtonTools);
        tools.setOnClickListener(this);
    }

    private void courseHelpClick(){
        startActivity(new Intent(getApplicationContext(), CourseInfoMenuActivity.class));
    }

    private void facilityInfoClick(){
        startActivity(new Intent(getApplicationContext(), FacilityInfoActivity.class));
    }

    private void todoListClick(){
        startActivity(new Intent(getApplicationContext(), TodoListActivity.class));
    }

    private void toolsClick(){
        startActivity(new Intent(getApplicationContext(), ToolsActivity.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonCourseHelp:
                courseHelpClick();
                break;
            case R.id.imageButtonFacilityInfo:
                facilityInfoClick();
                break;
            case R.id.imageButtonTodoList:
                todoListClick();
                break;
            case R.id.imageButtonTools:
                toolsClick();
                break;

        }
    }
}
