package lukelunix.ntnumple.facilityinfo.libraries;

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
public class LibrariesActivity extends AppCompatActivity {

    //Declare global variables for FacultiesActivity
    private ExpandableListView expLibraryList;
    private TreeMap<String, List<String>> libraryData;
    private List<String> libraryList;
    private LibraryAdapter ladapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //Initialize global variables
        expLibraryList = (ExpandableListView) findViewById(R.id.listViewLibrary);
        libraryData = LibrariesData.getData();


        libraryList = new ArrayList<String>(libraryData.keySet());
        ladapter = new LibraryAdapter(this, libraryData, libraryList);

        //Set LibraryAdapter to ExpandableListView
        expLibraryList.setAdapter(ladapter);
    }

}
