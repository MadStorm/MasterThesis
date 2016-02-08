package lukelunix.ntnumple.coursehelp.classmate.readreview;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 20.01.2016.
 */
public class ReadReviewTab extends Fragment {

    private TextView username, course, comment, timestamp;
    private Button btn;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


       View view = inflater.inflate(R.layout.readreviewtab,container,false);
        username = (TextView) view.findViewById(R.id.username);
        course = (TextView) view.findViewById(R.id.course);
        comment = (TextView) view.findViewById(R.id.comment);
        timestamp = (TextView) view.findViewById(R.id.timestamp);
        btn = (Button) view.findViewById(R.id.buttonSend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String susername = username.getText().toString();
                String scourse = course.getText().toString();
                String scomment = comment.getText().toString();

                HttpURLConnection connection;

                try {
                    URL url = new URL("folk.ntnu.no/reviews.php");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.connect();
                    InputStream stream = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(stream));


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        return view;
    }
}
