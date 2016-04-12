package lukelunix.ntnumple.feedback;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Gravity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import lukelunix.ntnumple.helpclasses.InternetConnection;
import lukelunix.ntnumple.helpclasses.InternetConnectionAlertDialog;

/**
 * Created by Luka on 30.03.2016.
 */
public class FeedbackGradingScaleLinks {
    private static WebView webview;
    private static InternetConnection ic;
    private final static String APP_TITLE = "NTNU mPLE";// App Name

    private final static int MINUTES_UNTIL_PROMPT = 30;//Min number of minutes
    private final static int LAUNCHES_UNTIL_PROMPT = 2;//Min number of launches

    private static int counter = 0;

    public static void app_launched(Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("feedback links", 0);
        if (prefs.getBoolean("dontshowagain", false)) {
            return;
        }

        SharedPreferences.Editor editor = prefs.edit();

        // Increment launch counter
        long launch_count = prefs.getLong("launch_count", 0) + 1;
        editor.putLong("launch_count", launch_count);

        // Get date of first launch
        Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
        if (date_firstLaunch == 0) {
            date_firstLaunch = System.currentTimeMillis();
            editor.putLong("date_firstlaunch", date_firstLaunch);
        }
        if (counter == 1) {
            date_firstLaunch = System.currentTimeMillis();
            editor.putLong("date_firstlaunch", date_firstLaunch);
            counter = 0;
        }


        // Wait at least n days before opening
        if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
            if (System.currentTimeMillis() >= date_firstLaunch + (MINUTES_UNTIL_PROMPT * 60 * 1000)) {
                showFeedbackDialog(mContext, editor);
            }
        }

        editor.commit();
    }



    public static void showFeedbackDialog(final Context mContext, final SharedPreferences.Editor editor) {
        final Dialog dialog = new Dialog(mContext);
        dialog.setTitle("Feedback " + APP_TITLE);

        LinearLayout layout = new LinearLayout(mContext);
        layout.setOrientation(LinearLayout.VERTICAL);

        counter = 1;

        webview = new WebView(mContext);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.loadUrl("http://goo.gl/forms/ZUbZhKT081");


        webview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        Toast.makeText(mContext, "Loading...",
                Toast.LENGTH_SHORT).show();

        //Check for Internet connection
        ic = new InternetConnection(mContext);
        if( !ic.isNetworkAvailable() ){
            InternetConnectionAlertDialog.showNoInternetConnectionAlertDialog(mContext);
        }

        layout.addView(webview);

        TextView textView = new TextView(mContext);
        textView.setText("If you enjoy using " + APP_TITLE + ", please take a moment to give feedback and rate it.\n Thanks for your support!");
        textView.setGravity(Gravity.CENTER);
        textView.setWidth(240);
        textView.setPadding(4, 0, 4, 10);
        layout.addView(textView);

        dialog.setContentView(layout);
        dialog.show();
    }

}
