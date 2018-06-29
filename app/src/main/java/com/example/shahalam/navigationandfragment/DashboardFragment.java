package com.example.shahalam.navigationandfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DashboardFragment extends Fragment {

    String[] routines = {"Bus", "Class", "Exam"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dashboard_fragment, container,false);

        RecyclerView recyclerView = rootView.findViewById(R.id.dashboardRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);



        DashboardAdapter adapter = new DashboardAdapter(this.getActivity(), routines);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
