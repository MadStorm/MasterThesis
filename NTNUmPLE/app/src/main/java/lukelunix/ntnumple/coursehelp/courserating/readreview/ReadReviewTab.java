package lukelunix.ntnumple.coursehelp.courserating.readreview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 20.01.2016.
 */
public class ReadReviewTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.readreviewtab,container,false);
    }


}
