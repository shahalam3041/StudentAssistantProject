package com.example.shahalam.navigationandfragment.ClassRoutineTab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.shahalam.navigationandfragment.ClassRoutineTab.MondayFragment;
import com.example.shahalam.navigationandfragment.ClassRoutineTab.SundayFragment;

public class ClassRoutineAdapter extends FragmentStatePagerAdapter {
    public ClassRoutineAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new SundayFragment();
            case 1: return new MondayFragment();
            case 2: return new TuesdayFragment();
            case 3: return new WednesdayFragment();
            case 4: return new ThursdayFragment();
            case 5: return new FridayFragment();
            case 6: return new SaturdayFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "Sun";
            case 1: return "Mon";
            case 2: return "Tues";
            case 3: return "Wednes";
            case 4: return "Thurs";
            case 5: return "Fri";
            case 6: return "Satur";
            default: return null;
        }
    }
}
