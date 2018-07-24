package com.example.shahalam.navigationandfragment.ClassRoutineTab;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shahalam.navigationandfragment.R;

public class ClassRoutine extends AppCompatActivity implements MondayFragment.OnFragmentInteractionListener, SundayFragment.OnFragmentInteractionListener,TuesdayFragment.OnFragmentInteractionListener,WednesdayFragment.OnFragmentInteractionListener,ThursdayFragment.OnFragmentInteractionListener,FridayFragment.OnFragmentInteractionListener,SaturdayFragment.OnFragmentInteractionListener{

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_routine);

        tabLayout = findViewById(R.id.tabLayoutClassRoutine);
        viewPager = findViewById(R.id.viewPagerClassRoutine);

        ClassRoutineAdapter classRoutineAdapter = new ClassRoutineAdapter(getSupportFragmentManager());
        viewPager.setAdapter(classRoutineAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
