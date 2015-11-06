package lukelunix.ntnumple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.coursehelp.CourseInfoMenuActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton coursehelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coursehelp = (ImageButton)findViewById(R.id.imageButtonCourseHelp);
        coursehelp.setOnClickListener(this);
    }

    private void courseHelpClick(){
        startActivity(new Intent(getApplicationContext(), CourseInfoMenuActivity.class));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonCourseHelp:
                courseHelpClick();
                break;

        }
    }
}
