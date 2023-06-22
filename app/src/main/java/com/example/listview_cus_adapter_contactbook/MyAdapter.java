package com.example.listview_cus_adapter_contactbook;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    MainActivity mainActivity;
    int[] imgarr;
    String[] name;
    String[] phonenumber;
    String[] Details;

    public MyAdapter (MainActivity mainActivity,int[] imgarr,String[] name,String[] phonenumber, String[] Details) {
        this.mainActivity=mainActivity;
        this.imgarr=imgarr;
        this.name=name;
        this.phonenumber=phonenumber;
        this.Details=Details;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(mainActivity).inflate(R.layout.item_page,
                viewGroup,false);
        ImageView imageView=view.findViewById(R.id.imageview);
        TextView txt1=view.findViewById(R.id.item_txt1);
        TextView txt2=view.findViewById(R.id.item_txt2);


        imageView.setImageResource(imgarr[position]);
        txt1.setText(""+name[position]);
        txt2.setText(""+phonenumber[position]);
        return view;
    }
}
