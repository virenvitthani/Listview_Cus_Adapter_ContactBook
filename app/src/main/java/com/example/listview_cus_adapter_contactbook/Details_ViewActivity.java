package com.example.listview_cus_adapter_contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_ViewActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view);
        txt1=findViewById(R.id.Details_txt1);
        txt2=findViewById(R.id.Details_txt2);
        imageView=findViewById(R.id.Details_imgarr);
        txt3=findViewById(R.id.Details_txt3);

        int position=getIntent().getIntExtra("pos",0);
        String name[]=getIntent().getStringArrayExtra("name");
        String phonenumber[]=getIntent().getStringArrayExtra("phonenumber");
        int imgarr[]=getIntent().getIntArrayExtra("imgarr");
        String Details[]=getIntent().getStringArrayExtra("Details");

        txt1.setText(""+name[position]);
        txt2.setText(""+phonenumber[position]);
        txt3.setText(""+Details[position]);
        imageView.setImageResource(imgarr[position]);

    }
}