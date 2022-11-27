package com.example.cc_android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
    private final Activity context;
    private user[] myUser;


    public MyListAdapter(Activity context, user[] u) {
        super();
        Log.e("reached","MyListAdapter");
        this.context = context;
        myUser = u;
    }

    @Override
    public int getCount() {
        return myUser.length;
    }

    @Override
    public Object getItem(int i) {
        return myUser[i];
    }

    @Override
    public long getItemId(int i) {
        return myUser[i].image;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        Log.e("getView","Line 1");
        LayoutInflater inflater = context.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.custom_list_layout,null,true);

        TextView txtTitle = rootView.findViewById(R.id.lst_title);
        TextView txtDesc = rootView.findViewById(R.id.lst_desc);
        ImageView img = rootView.findViewById(R.id.lst_img);

        txtTitle.setText(myUser[position].name);
        txtDesc.setText(myUser[position].desc);
        img.setImageResource(myUser[position].image);

        return rootView;


    }
}
