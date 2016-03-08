package lukelunix.ntnumple.coursehelp.faqaboutcourses;

import android.content.Context;
import android.widget.ExpandableListView;

/**
 * Created by Luka on 01.03.2016.
 */
public class SecondLevelExpandableList extends ExpandableListView{

        public SecondLevelExpandableList(Context context) {
            super(context);
        }

        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            //999999 is a size in pixels. ExpandableListView requires a maximum height in order to do measurement calculations.
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }

}
