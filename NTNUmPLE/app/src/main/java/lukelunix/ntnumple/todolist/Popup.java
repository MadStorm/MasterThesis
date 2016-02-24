package lukelunix.ntnumple.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 24.02.2016.
 */
public class Popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int) (height*.6));


    }
}
