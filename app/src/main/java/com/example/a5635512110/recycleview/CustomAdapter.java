package com.example.a5635512110.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by 5635512110 on 3/30/2018.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] list;

    public CustomAdapter(Context applicationContext, String[] list) {
        this.context = applicationContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public Object getItem(int position) {
        return list[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // use inflate to create list view layout (from listview_row.xml)

        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView tvName = view.findViewById(R.id.tvName);
        tvName.setText(list[position]);
        return view;
    }
}
