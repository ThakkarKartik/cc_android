package com.example.cc_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view)
    {
        switch (view.getId())
        {
            case R.id.btnList:
                Intent intent = new Intent(getApplicationContext(),custom_list_userlist.class);
                startActivity(intent);
            case R.id.btnUsers:
                intent = new Intent(getApplicationContext(),custom_list_userlist.class);
                startActivity(intent);
            case R.id.btnNavigate:
                intent = new Intent(getApplicationContext(),recycler_view_demo.class);
                startActivity(intent);

        }
    }
}