package lukelunix.ntnumple.facilityinfo;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import lukelunix.ntnumple.R;

/**
 * Created by Luka on 24.11.2015.
 */
public class FacultyAdapter extends BaseExpandableListAdapter{

    private Context ctx;
    private HashMap<String, List<String>> faculties;
    private List<String> facultyList;

    public FacultyAdapter(Context ctx, HashMap<String, List<String>> faculties, List<String> facultyList){

        this.ctx = ctx;
        this.faculties = faculties;
        this.facultyList = facultyList;
    }

    @Override
    public int getGroupCount() {
        return facultyList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return faculties.get(facultyList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return facultyList.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return faculties.get(facultyList.get(parent)).get(child);
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
            convertView = inflator.inflate(R.layout.faculty_category, parent, false);
        }
        TextView parent_textview = (TextView) convertView.findViewById(R.id.parent_txt);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
        String child_title = (String) getChild(parent, child);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.faculty_info, parentView, false);
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
