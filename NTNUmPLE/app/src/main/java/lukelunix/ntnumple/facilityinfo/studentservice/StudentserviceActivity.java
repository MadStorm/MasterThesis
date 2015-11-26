package lukelunix.ntnumple.facilityinfo.studentservice;

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
    }

}
