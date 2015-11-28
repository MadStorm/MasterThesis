package lukelunix.ntnumple.facilityinfo.sit;

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
 * Created by Luka on 27.11.2015.
 */
public class SiTAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private TreeMap<String, List<String>> sits;
    private List<String> sitList;

    public SiTAdapter(Context ctx, TreeMap<String, List<String>> sits, List<String> sitList){

        this.ctx = ctx;
        this.sits = sits;
        this.sitList = sitList;
    }

    @Override
    public int getGroupCount() {
        return sitList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return sits.get(sitList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return sitList.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return sits.get(sitList.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int parent  , int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String group_title = (String) getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.sit_category, parent, false);
        }
        TextView parent_textview = (TextView) convertView.findViewById(R.id.sit_category);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
        String child_title = (String) getChild(parent, child);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sit_info, parentView, false);
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.sit_info);
        child_textview.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}
