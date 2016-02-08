package lukelunix.ntnumple.contact.studentservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.mainmenu.MainActivity;

/**
 * Created by Luka on 24.11.2015.
 */
public class StudentserviceActivity extends AppCompatActivity {

    //Declare global variables for FacultiesActivity
    private ExpandableListView expStudentserviceList;
    private TreeMap<String, List<String>> studentserviceData;
    private List<String> studentserviceList;
    private StudentserviceAdapter sadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentservice);

        //Initialize global variables
        expStudentserviceList = (ExpandableListView) findViewById(R.id.listViewStudentservice);
        studentserviceData = StudentserviceData.getData();
        studentserviceList = new ArrayList<String>(studentserviceData.keySet());
        sadapter = new StudentserviceAdapter(this, studentserviceData, studentserviceList);

        //Set StudentserviceAdapter to ExpandableListView
        expStudentserviceList.setAdapter(sadapter);

        //Add home menu button to actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.homewhite);
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
}
