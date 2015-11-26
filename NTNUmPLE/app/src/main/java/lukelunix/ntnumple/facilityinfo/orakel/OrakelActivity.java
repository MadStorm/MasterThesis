package lukelunix.ntnumple.facilityinfo.orakel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.facilityinfo.libraries.LibrariesData;
import lukelunix.ntnumple.facilityinfo.libraries.LibraryAdapter;

/**
 * Created by Luka on 24.11.2015.
 */
public class OrakelActivity extends AppCompatActivity {

    //Declare global variables for FacultiesActivity
    private ExpandableListView expOrakelList;
    private TreeMap<String, List<String>> orakelData;
    private List<String> orakelList;
    private OrakelAdapter oadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orakel);

        //Initialize global variables
        expOrakelList = (ExpandableListView) findViewById(R.id.listViewOrakel);
        orakelData = OrakelData.getData();
        orakelList = new ArrayList<String>(orakelData.keySet());
        oadapter = new OrakelAdapter(this, orakelData, orakelList);

        //Set OrakelAdapter to ExpandableListView
        expOrakelList.setAdapter(oadapter);
    }

}
