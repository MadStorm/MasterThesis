package lukelunix.ntnumple.facilityinfo.akademika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.facilityinfo.studentservice.StudentserviceAdapter;
import lukelunix.ntnumple.facilityinfo.studentservice.StudentserviceData;

/**
 * Created by Luka on 24.11.2015.
 */
public class AkademikaActivity extends AppCompatActivity {


    //Declare global variables for FacultiesActivity
    private ExpandableListView expAkademikaList;
    private TreeMap<String, List<String>> akademikaData;
    private List<String> akademikaList;
    private AkademikaAdapter aadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademika);

        //Initialize global variables
        expAkademikaList = (ExpandableListView) findViewById(R.id.listViewAkademika);
        akademikaData = AkademikaData.getData();
        akademikaList = new ArrayList<String>(akademikaData.keySet());
        aadapter = new AkademikaAdapter(this, akademikaData, akademikaList);

        //Set AkademikaAdapter to ExpandableListView
        expAkademikaList.setAdapter(aadapter);
    }

}
