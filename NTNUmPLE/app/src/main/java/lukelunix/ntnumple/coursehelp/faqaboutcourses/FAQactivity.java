package lukelunix.ntnumple.coursehelp.faqaboutcourses;

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

public class FAQactivity extends AppCompatActivity {

    //Declare global variables for FAQactivity
    private ExpandableListView expFaqCategory;
    private TreeMap<String, List<String>> levelOneFaqData, levelTwoFaqExamData, levelTwoFaqAdmissionData;
    private List<String> levelOneFaqList, levelTwoExamFaqList, levelTwoAdmissionFaqList;
    private FAQFirstLevelAdapter faqFirstLevelAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        //Initialize global variables
        expFaqCategory = (ExpandableListView) findViewById(R.id.listViewFaq);

        levelOneFaqData = FAQdata.getCategoryData();
        levelTwoFaqExamData = FAQdata.getSubCategoryDataAboutExams();
        levelTwoFaqAdmissionData = FAQdata.getSubCategoryDataAboutAdmission();

        levelOneFaqList = new ArrayList<String>(levelOneFaqData.keySet());
        levelTwoExamFaqList = new ArrayList<String>(levelTwoFaqExamData.keySet());
        levelTwoAdmissionFaqList = new ArrayList<String>(levelTwoFaqAdmissionData.keySet());

        //Send Cat and SubCat data and arraylists to First and Second Level adapter
        faqFirstLevelAdapter = new FAQFirstLevelAdapter(this,
                levelOneFaqData,
                levelTwoFaqExamData,
                levelTwoFaqAdmissionData,
                levelOneFaqList,
                levelTwoExamFaqList,
                levelTwoAdmissionFaqList);

        //Set FAQFirstLevelAdapter to ExpandableListView
        expFaqCategory.setAdapter(faqFirstLevelAdapter);

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
