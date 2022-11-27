package com.example.cc_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recycler_view_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        ArrayList<user> myList = new ArrayList<user>();
        user[] users = {
                new user("Hrithik","Bang Bang",R.drawable.ic_baseline_person_24),
                new user("Shahrukh","Kal ho na ho",R.drawable.ic_baseline_engineering_24),
                new user("Akshay","Raam Setu",R.drawable.ic_baseline_person_24),
                new user("Amitabh","Don",R.drawable.ic_baseline_engineering_24),
                new user("Ajay","Tanhaji",R.drawable.ic_baseline_person_24),
                new user("Salmaan","Bajarangi Bhaijan",R.drawable.ic_baseline_engineering_24),

        };
        for(int i=0;i<users.length;i++){
            myList.add(users[i]);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(getApplicationContext(),myList);
        recyclerView.setAdapter(myRecyclerAdapter);
        myRecyclerAdapter.notifyDataSetChanged();
    }
}