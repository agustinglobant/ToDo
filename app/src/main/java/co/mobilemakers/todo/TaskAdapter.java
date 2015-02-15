package co.mobilemakers.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by agustin on 14/02/15.
 */
public class TaskAdapter extends ArrayAdapter<Task> {

    Context mContext;
    List<Task> mTasks;

    public TaskAdapter(Context context, List<Task> taskList) {
        super(context, R.layout.list_item_entry, taskList);
        mContext = context;
        mTasks = taskList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = reuseOrGenerateRowView(convertView, parent);
        displayContentInRowView(position, rowView);

        return rowView;
    }

    private void displayContentInRowView(int position, View rowView) {
        if (rowView != null){
            TextView textViewTitle = (TextView)rowView.findViewById(R.id.text_view_task_title);
            textViewTitle.setText(mTasks.get(position).getmTitle());
            CheckBox checkBoxDone  = (CheckBox)rowView.findViewById(R.id.checkbox_task_done);
            checkBoxDone.setChecked(mTasks.get(position).getmDone());
        }
    }

    private View reuseOrGenerateRowView(View convertView, ViewGroup parent) {
        View rowView;
        if (convertView != null) {
            rowView = convertView;
        } else {
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item_entry, parent, false);
        }
        return rowView;
    }
}
