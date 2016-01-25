package lukelunix.ntnumple.tools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import lukelunix.ntnumple.R;
import lukelunix.ntnumple.mainmenu.MainActivity;
import lukelunix.ntnumple.tools.kahoot.KahootActivity;
import lukelunix.ntnumple.tools.mazemap.MazemapActivity;
import lukelunix.ntnumple.tools.roomreservation.RoomreservationActivity;

public class ToolsActivity extends AppCompatActivity implements View.OnClickListener{

    //Tools menu buttons
    private ImageButton mazemap;
    private ImageButton kahoot;
    private ImageButton roomreservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        mazemap = (ImageButton) findViewById(R.id.imageButtonMazeMap);
        mazemap.setOnClickListener(this);
        kahoot = (ImageButton) findViewById(R.id.imageButtonKahoot);
        kahoot.setOnClickListener(this);
        roomreservation = (ImageButton) findViewById(R.id.imageButtonRoomReservation);
        roomreservation.setOnClickListener(this);

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


    private void mazemapClick(){
        startActivity(new Intent(getApplicationContext(), MazemapActivity.class));
    }

    private void kahootClick(){
        startActivity(new Intent(getApplicationContext(), KahootActivity.class));
    }

    private void roomreservationClick(){
        startActivity(new Intent(getApplicationContext(), RoomreservationActivity.class));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButtonMazeMap:
                mazemapClick();
                break;
            case R.id.imageButtonKahoot:
                kahootClick();
                break;
            case R.id.imageButtonRoomReservation:
                roomreservationClick();
                break;
        }
    }
}