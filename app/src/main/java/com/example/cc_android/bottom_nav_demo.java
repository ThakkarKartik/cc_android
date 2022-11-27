package com.example.cc_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottom_nav_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_demo);
        NavigationBarView nav = findViewById(R.id.menu_items);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                switch (item.getItemId()){
                    case R.id.menu_Login:
                        fragmentManager.beginTransaction()
                                .replace(R.id.fragmentContainerView2, UserLogin.class, null)
                                .setReorderingAllowed(true)
                                .addToBackStack("name")
                                .commit();
                        break;
                    case R.id.menu_profile:
                        fragmentManager.beginTransaction()
                                .replace(R.id.fragmentContainerView2, UserProfile.class, null)
                                .setReorderingAllowed(true)
                                .addToBackStack("name")
                                .commit();
                        break;
                    case R.id.menu_news:

                        fragmentManager.beginTransaction()
                                .replace(R.id.fragmentContainerView2, News.class, null)
                                .setReorderingAllowed(true)
                                .addToBackStack("name")
                                .commit();
                        break;
                }


                return true;
            }
        });

//        BottomNavigationView myMenu = findViewById(R.id.menu_items);
//        myMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                switch (item.getItemId()){
//                    case R.id.menu_Login:
//                        fragmentManager.beginTransaction()
//                                .replace(R.id.fragmentContainerView2, UserLogin.class, null)
//                                .setReorderingAllowed(true)
//                                .addToBackStack("name")
//                                .commit();
//                        break;
//                    case R.id.menu_profile:
//                        fragmentManager.beginTransaction()
//                                .replace(R.id.fragmentContainerView2, UserProfile.class, null)
//                                .setReorderingAllowed(true)
//                                .addToBackStack("name")
//                                .commit();
//                        break;
//                    case R.id.menu_news:
//
//                        fragmentManager.beginTransaction()
//                                .replace(R.id.fragmentContainerView2, News.class, null)
//                                .setReorderingAllowed(true)
//                                .addToBackStack("name")
//                                .commit();
//                        break;
//                }
//
//                return true;
//            }
//        });


    }
}