package com.example.cc_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class custom_list_userlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_userlist);
        Log.e("reached","OnCreate");
        user[] users = {
                new user("Hrithik","Bang Bang",R.drawable.ic_baseline_person_24),
                new user("Shahrukh","Kal ho na ho",R.drawable.ic_baseline_engineering_24),
                new user("Akshay","Raam Setu",R.drawable.ic_baseline_person_24),
                new user("Amitabh","Don",R.drawable.ic_baseline_engineering_24),
                new user("Ajay","Tanhaji",R.drawable.ic_baseline_person_24),
                new user("Salmaan","Bajarangi Bhaijan",R.drawable.ic_baseline_engineering_24),

        };
        ListView lstUser = findViewById(R.id.lst_user);
        Log.e("reached","ListView Created");
        MyListAdapter adapter = new MyListAdapter(this,users);
        lstUser.setAdapter(adapter);
        Log.e("reached","setAdapter");

        lstUser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked on "+users[i].name,Toast.LENGTH_SHORT).show();
            }
        });

    }
}