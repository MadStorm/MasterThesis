package lukelunix.ntnumple.contact.faculties;

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
public class FacultiesActivity extends AppCompatActivity{

    //Declare global variables for FacultiesActivity
    private ExpandableListView expFacultyList;
    private TreeMap<String, List<String>> facultyData;
    private List<String> facultyList;
    private FacultyAdapter fadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        //Initialize global variables
        expFacultyList = (ExpandableListView) findViewById(R.id.listViewFaculty);
        facultyData = FacultiesData.getData();
        facultyList = new ArrayList<String>(facultyData.keySet());
        fadapter = new FacultyAdapter(this, facultyData, facultyList);

        //Set FacultyAdapter to ExpandableListView
        expFacultyList.setAdapter(fadapter);


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