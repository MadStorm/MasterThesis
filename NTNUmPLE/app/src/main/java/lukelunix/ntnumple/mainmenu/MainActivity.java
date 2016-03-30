package lukelunix.ntnumple.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageButton;

import java.lang.reflect.Field;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.contact.ContactActivity;
import lukelunix.ntnumple.coursehelp.CoursehelpActivity;
import lukelunix.ntnumple.feedback.FeedbackInMenu;
import lukelunix.ntnumple.links.LinksActivity;
import lukelunix.ntnumple.todolist.TodoListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Main todolistmenu buttons
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
        getOverflowMenu();
    }

    private void courseHelpClick(){
        startActivity(new Intent(getApplicationContext(), CoursehelpActivity.class));
    }

    private void facilityInfoClick(){
        startActivity(new Intent(getApplicationContext(), ContactActivity.class));
    }

    private void todoListClick(){
        startActivity(new Intent(getApplicationContext(), TodoListActivity.class));
    }

    private void toolsClick(){
        startActivity(new Intent(getApplicationContext(), LinksActivity.class));
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

    private void getOverflowMenu() {

        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.feedbackmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Main menu menu - feedback
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.buttonFeedback:
                new FeedbackInMenu().showFeedbackDialog(this);
                break;
        }
        return (super.onOptionsItemSelected(menuItem));
    }
}
