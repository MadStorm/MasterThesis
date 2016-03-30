package lukelunix.ntnumple.coursehelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.coursehelp.courses.CoursesActivity;
import lukelunix.ntnumple.coursehelp.faqaboutcourses.FAQactivity;
import lukelunix.ntnumple.coursehelp.forum.ForumActivity;
import lukelunix.ntnumple.feedback.FeedbackGradingScaleCourseHelp;
import lukelunix.ntnumple.mainmenu.MainActivity;

public class CoursehelpActivity extends AppCompatActivity implements View.OnClickListener {

    //Course Help menu buttons
    private ImageButton courses;
    private ImageButton courserating;
    private ImageButton forum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursehelp_menu);
        courses = (ImageButton) findViewById(R.id.imageButtonCourses);
        courses.setOnClickListener(this);
        courserating = (ImageButton) findViewById(R.id.imageButtonCourseRating);
        courserating.setOnClickListener(this);
        forum = (ImageButton) findViewById(R.id.imageButtonForum);
        forum.setOnClickListener(this);

        FeedbackGradingScaleCourseHelp.app_launched(this);

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
    private void coursesClick(){
        startActivity(new Intent(getApplicationContext(), CoursesActivity.class));
    }

    private void courseratingClick(){
        startActivity(new Intent(getApplicationContext(), FAQactivity.class));
    }

    private void forumClick(){
        startActivity(new Intent(getApplicationContext(), ForumActivity.class));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonCourses:
                coursesClick();
                break;
            case R.id.imageButtonCourseRating:
                courseratingClick();
                break;
            case R.id.imageButtonForum:
                forumClick();
                break;
        }
    }
}