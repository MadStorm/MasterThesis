package lukelunix.ntnumple.feedback;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Luka on 01.03.2016.
 */
public class Feedback {

    private final static String APP_TITLE = "NTNU mPLE";// App Name

    private final static int DAYS_UNTIL_PROMPT = 3;//Min number of days
    private final static int LAUNCHES_UNTIL_PROMPT = 3;//Min number of launches

    public static void app_launched(Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("feedback", 0);
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

        // Wait at least n days before opening
        if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
            if (System.currentTimeMillis() >= date_firstLaunch + (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
                showRateDialog(mContext, editor);
            }
        }

        editor.commit();
    }

    public static void showRateDialog(final Context mContext, final SharedPreferences.Editor editor) {
        final Dialog dialog = new Dialog(mContext);
        dialog.setTitle("Feedback " + APP_TITLE);

        LinearLayout layout = new LinearLayout(mContext);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView textView = new TextView(mContext);
        textView.setText("If you enjoy using " + APP_TITLE + ", please take a moment to give feedback and rate it.\n Thanks for your support!");
        textView.setGravity(Gravity.CENTER);
        textView.setWidth(240);
        textView.setPadding(4, 0, 4, 10);
        layout.addView(textView);

        Button b1 = new Button(mContext);
        b1.setText("Give feedback Google Survey");
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://goo.gl/forms/rk9EIhO99V")));
               // dialog.dismiss();
            }
        });
        layout.addView(b1);

        Button b2 = new Button(mContext);
        b2.setText("Rate " + APP_TITLE);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=lukelunix.ntnumple&hl=no")));
               // dialog.dismiss();
            }
        });
        layout.addView(b2);

        Button b3 = new Button(mContext);
        b3.setText("Remind me later");
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        layout.addView(b3);

        Button b4 = new Button(mContext);
        b4.setText("No, thanks");
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editor != null) {
                    editor.putBoolean("dontshowagain", true);
                    editor.commit();
                }
                dialog.dismiss();
            }
        });
        layout.addView(b4);

        dialog.setContentView(layout);
        dialog.show();
    }
}


