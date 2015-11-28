package lukelunix.ntnumple.facilityinfo.sit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.facilityinfo.akademika.AkademikaAdapter;
import lukelunix.ntnumple.facilityinfo.akademika.AkademikaData;

/**
 * Created by Luka on 24.11.2015.
 */
public class SiTActivity extends AppCompatActivity {

    //Declare global variables for FacultiesActivity
    private ExpandableListView expSiTList;
    private TreeMap<String, List<String>> sitData;
    private List<String> sitList;
    private SiTAdapter sadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit);

        //Initialize global variables
        expSiTList = (ExpandableListView) findViewById(R.id.listViewSit);
        sitData = SiTData.getData();
        sitList = new ArrayList<String>(sitData.keySet());
        sadapter = new SiTAdapter(this, sitData, sitList);

        //Set AkademikaAdapter to ExpandableListView
        expSiTList.setAdapter(sadapter);
    }

}
