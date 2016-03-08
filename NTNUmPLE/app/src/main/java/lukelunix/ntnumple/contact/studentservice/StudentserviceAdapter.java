package lukelunix.ntnumple.contact.studentservice;

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
 * Created by Luka on 26.11.2015.
**/

public class StudentserviceAdapter extends BaseExpandableListAdapter {

        private Context ctx;
        private TreeMap<String, List<String>> studentservices;
        private List<String> studentserviceList;

        public StudentserviceAdapter(Context ctx, TreeMap<String, List<String>> studentservices, List<String> studentserviceList){

            this.ctx = ctx;
            this.studentservices = studentservices;
            this.studentserviceList = studentserviceList;
        }

        @Override
        public int getGroupCount() {
            return studentserviceList.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return studentservices.get(studentserviceList.get(groupPosition)).size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            return studentserviceList.get(groupPosition);
        }

        @Override
        public Object getChild(int parent, int child) {
            return studentservices.get(studentserviceList.get(parent)).get(child);
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
                convertView = inflator.inflate(R.layout.studentservice_category, parent, false);
            }
            TextView parent_textview = (TextView) convertView.findViewById(R.id.studentservice_category);
            parent_textview.setTypeface(null, Typeface.BOLD);
            parent_textview.setText(group_title);
            return convertView;
        }

        @Override
        public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
            String child_title = (String) getChild(parent, child);
            if(convertView == null){
                LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.studentservice_info, parentView, false);
            }
            TextView child_textview = (TextView) convertView.findViewById(R.id.studentservice_info);
            child_textview.setText(child_title);
            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
}
