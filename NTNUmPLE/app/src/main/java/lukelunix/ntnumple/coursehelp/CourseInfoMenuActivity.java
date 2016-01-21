package lukelunix.ntnumple.coursehelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.coursehelp.courserating.CourseratingActivity;
import lukelunix.ntnumple.coursehelp.courses.CoursesActivity;
import lukelunix.ntnumple.coursehelp.forum.ForumActivity;
import lukelunix.ntnumple.mainmenu.MainActivity;
import lukelunix.ntnumple.tools.kahoot.KahootActivity;
import lukelunix.ntnumple.tools.mazemap.MazemapActivity;
import lukelunix.ntnumple.tools.roomreservation.RoomreservationActivity;

public class CourseInfoMenuActivity extends AppCompatActivity implements View.OnClickListener {

    //Course Help menu buttons
    private ImageButton courses;
    private ImageButton courserating;
    private ImageButton forum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info_menu);
        courses = (ImageButton) findViewById(R.id.imageButtonCourses);
        courses.setOnClickListener(this);
        courserating = (ImageButton) findViewById(R.id.imageButtonCourseRating);
        courserating.setOnClickListener(this);
        forum = (ImageButton) findViewById(R.id.imageButtonForum);
        forum.setOnClickListener(this);


        //Add home menu button to actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.rsz_homeicon);
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
        startActivity(new Intent(getApplicationContext(), CourseratingActivity.class));
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