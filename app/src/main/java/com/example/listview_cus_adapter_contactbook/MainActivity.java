package com.example.listview_cus_adapter_contactbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int imgarr[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                    R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};

    String name[] = {"Rock","Leonardo Dicaprio","Vikram","Hirtik Rosan","S.S.Rajamoli","Tom Cruise",
                     "Aayushman Khurana","Kgf Yash","Ajay Davgan","Prabhash"};

    String phonenumber[] = {"7894543134","1354861131","3156894653","5689423786","7894631568",
                            "7894613643","9876346487","2354797834","7864231894","5455876648"};

    String Details[] = {"1","2","3","4","5","6","7","8","9","10"};

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        myAdapter=new MyAdapter(MainActivity.this,imgarr,name,phonenumber,Details);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(MainActivity.this,Details_ViewActivity.class);
                intent.putExtra("pos",position);
                intent.putExtra("name",name);
                intent.putExtra("phonenumber",phonenumber);
                intent.putExtra("imgarr",imgarr);
                intent.putExtra("Details",Details);
                startActivity(intent);
            }
        });
    }
}