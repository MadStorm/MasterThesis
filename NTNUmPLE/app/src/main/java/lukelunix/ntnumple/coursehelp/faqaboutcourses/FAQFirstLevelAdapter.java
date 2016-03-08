package lukelunix.ntnumple.coursehelp.faqaboutcourses;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.TreeMap;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 01.03.2016.
 */
public class FAQFirstLevelAdapter extends BaseExpandableListAdapter {

    /**
     * New and improved. Feel free to contact me if you have any questions.
     */

    private Context ctx;
    private TreeMap<String, List<String>> levelOneFaqs, levelTwoExamFaqs, levelTwoAdmissionFaqs;
    private List<String> levelOneFaqsList, levelTwoExamFaqsList, levelTwoAdmissionFaqsList;

    public FAQFirstLevelAdapter(Context ctx,
                                TreeMap<String, List<String>> levelOneFaqs,
                                TreeMap<String, List<String>> levelTwoExamFaqs,
                                TreeMap<String, List<String>> levelTwoAdmissionFaqs,
                                List<String> levelOneFaqsList,
                                List<String> levelTwoExamFaqsList,
                                List<String> levelTwoAdmissionFaqsList) {
        this.ctx = ctx;
        this.levelOneFaqs = levelOneFaqs;
        this.levelTwoExamFaqs = levelTwoExamFaqs;
        this.levelTwoAdmissionFaqs = levelTwoAdmissionFaqs;
        this.levelOneFaqsList = levelOneFaqsList;
        this.levelTwoExamFaqsList = levelTwoExamFaqsList;
        this.levelTwoAdmissionFaqsList = levelTwoAdmissionFaqsList;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String group_title = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faq_category, parent, false);
        }
        TextView text = (TextView) convertView.findViewById(R.id.faq_category);
        text.setTypeface(null, Typeface.BOLD);
        text.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if(groupPosition == 1){
            SecondLevelExpandableList secondLevelELV = new SecondLevelExpandableList(ctx);
            secondLevelELV.setAdapter(new FAQSecondLevelExamAdapter(ctx, levelTwoExamFaqs, levelTwoExamFaqsList));
            secondLevelELV.setGroupIndicator(null);
            return secondLevelELV;
        }
        else{
            SecondLevelExpandableList secondLevelELV = new SecondLevelExpandableList(ctx);
            secondLevelELV.setAdapter(new FAQSecondLevelAdmissionAdapter(ctx, levelTwoAdmissionFaqs, levelTwoAdmissionFaqsList));
            secondLevelELV.setGroupIndicator(null);
            return secondLevelELV;
        }
    }

    @Override
    public int getGroupCount() {
        return levelOneFaqsList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return levelOneFaqsList.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public Object getChild(int arg0, int arg1) {
        return arg1;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return levelOneFaqs.get(levelOneFaqsList.get(groupPosition)).size();
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }


}
