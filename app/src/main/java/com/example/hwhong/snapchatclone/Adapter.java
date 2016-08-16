package com.example.hwhong.snapchatclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hwhong on 7/25/16.
 */
public class Adapter extends ArrayAdapter<String> {

    ArrayList<String> company;
    Context c;
    LayoutInflater inflater;

    public Adapter(Context context, ArrayList<String> company) {
        super(context, R.layout.buttonrow, company);
        this.c = context;
        this.company = company;
    }

    public class ViewHolder {
        TextView company;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.buttonrow, null);
        }

        final ViewHolder holder = new  ViewHolder();

        holder.company = (TextView) convertView.findViewById(R.id.company);
        holder.company.setText(company.get(position));

        return convertView;
    }
}

