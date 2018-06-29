package com.example.shahalam.navigationandfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    NotificationFragment notificationFragment = new NotificationFragment();
    HomeFragment homeFragment = new HomeFragment();
    DashboardFragment dashboardFragment = new DashboardFragment();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    FragmentManager HomeFragmentManager = getSupportFragmentManager();
                    FragmentTransaction HomeFragmentTransaction = HomeFragmentManager.beginTransaction();
                    HomeFragmentTransaction.replace(R.id.frameLayout, homeFragment);
                    HomeFragmentTransaction.commit();
                    return true;

                case R.id.navigation_dashboard:
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.frameLayout, dashboardFragment);
                    fragmentTransaction1.commit();
                    return true;

                case R.id.navigation_notifications:
                    FragmentManager fragmentManager2 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                    fragmentTransaction2.replace(R.id.frameLayout, notificationFragment);
                    fragmentTransaction2.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager HomeFragmentManager1 = getSupportFragmentManager();
        FragmentTransaction HomeFragmentTransaction1 = HomeFragmentManager1.beginTransaction();
        HomeFragmentTransaction1.replace(R.id.frameLayout, homeFragment);
        HomeFragmentTransaction1.commit();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
