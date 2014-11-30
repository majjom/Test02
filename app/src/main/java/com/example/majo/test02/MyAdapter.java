package com.example.majo.test02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by majo on 30-Nov-14.
 */
public class MyAdapter extends ArrayAdapter<String>
{

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout, parent, false);

        String tvShow = getItem(position);

        TextView text = (TextView) theView.findViewById(R.id.textView1);

        text.setText(tvShow);

        return theView;

        //return super.getView(position, convertView, parent);
    }
}
