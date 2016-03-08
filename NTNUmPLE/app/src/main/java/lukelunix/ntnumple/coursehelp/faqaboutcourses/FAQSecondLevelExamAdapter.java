package lukelunix.ntnumple.coursehelp.faqaboutcourses;

import android.content.Context;
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
public class FAQSecondLevelExamAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private TreeMap<String, List<String>> levelTwoExamFaqs;
    private List<String> levelTwoExamFaqsList;

    public FAQSecondLevelExamAdapter(Context ctx,
                                     TreeMap<String, List<String>> levelTwoExamFaqs,
                                     List<String> levelTwoExamFaqsList) {
        this.ctx = ctx;
        this.levelTwoExamFaqs = levelTwoExamFaqs;
        this.levelTwoExamFaqsList = levelTwoExamFaqsList;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String group_title =  (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faq_subcat, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(R.id.faq_category_sub);
        text.setText(group_title);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String child_title = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faq_info, parent, false);

        }

        TextView text = (TextView) convertView.findViewById(R.id.faq_info);
        text.setText(child_title);

        return convertView;
    }

    @Override
    public int getGroupCount() {
        return levelTwoExamFaqsList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return levelTwoExamFaqsList.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return levelTwoExamFaqs.get(levelTwoExamFaqsList.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return levelTwoExamFaqs.get(levelTwoExamFaqsList.get(groupPosition)).size();
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }


}

