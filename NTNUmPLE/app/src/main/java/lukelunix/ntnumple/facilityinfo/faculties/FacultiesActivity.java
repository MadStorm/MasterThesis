package lukelunix.ntnumple.facilityinfo.faculties;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;

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

    }
}
