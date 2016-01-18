package lukelunix.ntnumple.tools.roomreservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import lukelunix.ntnumple.R;

public class RoomreservationActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomreservation);

        webview = (WebView) findViewById(R.id.webviewroomreservation);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://romres.ntnu.no/2016/Login.aspx?ReturnUrl=%2f2016%2f");
    }
}
