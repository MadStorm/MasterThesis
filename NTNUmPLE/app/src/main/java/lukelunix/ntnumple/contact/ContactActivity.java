package lukelunix.ntnumple.contact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.contact.akademika.AkademikaActivity;
import lukelunix.ntnumple.contact.faculties.FacultiesActivity;
import lukelunix.ntnumple.contact.libraries.LibrariesActivity;
import lukelunix.ntnumple.contact.orakel.OrakelActivity;
import lukelunix.ntnumple.contact.sit.SiTActivity;
import lukelunix.ntnumple.contact.studentservice.StudentserviceActivity;
import lukelunix.ntnumple.feedback.FeedbackGradingScaleContact;
import lukelunix.ntnumple.mainmenu.MainActivity;


public class ContactActivity extends AppCompatActivity implements View.OnClickListener{


    //Main menu buttons
    private ImageButton facilities;
    private ImageButton libraries;
    private ImageButton orakel;
    private ImageButton studentservice;
    private ImageButton akademika;
    private ImageButton sit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_menu);
        facilities = (ImageButton)findViewById(R.id.imageButtonFaculty);
        facilities.setOnClickListener(this);
        libraries = (ImageButton)findViewById(R.id.imageButtonLibrary);
        libraries.setOnClickListener(this);
        orakel = (ImageButton)findViewById(R.id.imageButtonOrakel);
        orakel.setOnClickListener(this);
        studentservice = (ImageButton)findViewById(R.id.imageButtonStudentservice);
        studentservice.setOnClickListener(this);
        akademika = (ImageButton)findViewById(R.id.imageButtonAkademika);
        akademika.setOnClickListener(this);
        sit = (ImageButton)findViewById(R.id.imageButtonSiT);
        sit.setOnClickListener(this);

        FeedbackGradingScaleContact.app_launched(this);

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


    private void facultyClick(){
        startActivity(new Intent(getApplicationContext(), FacultiesActivity.class));
    }

    private void libraryClick(){
        startActivity(new Intent(getApplicationContext(), LibrariesActivity.class));
    }

    private void orakelClick(){
        startActivity(new Intent(getApplicationContext(), OrakelActivity.class));
    }

    private void studentserviceClick(){
        startActivity(new Intent(getApplicationContext(), StudentserviceActivity.class));
    }

    private void akademikaClick() {
        startActivity(new Intent(getApplicationContext(), AkademikaActivity.class));
    }

    private void sitClick() {
        startActivity(new Intent(getApplicationContext(), SiTActivity.class));
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonFaculty:
                facultyClick();
                break;
            case R.id.imageButtonLibrary:
                libraryClick();
                break;
            case R.id.imageButtonOrakel:
                orakelClick();
                break;
            case R.id.imageButtonStudentservice:
                studentserviceClick();
                break;
            case R.id.imageButtonAkademika:
                akademikaClick();
                break;
            case R.id.imageButtonSiT:
                sitClick();
                break;


        }
    }
}
