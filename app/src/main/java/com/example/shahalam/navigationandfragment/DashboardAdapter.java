package com.example.shahalam.navigationandfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DashboardAdapter extends RecyclerView.Adapter<myViewHolder> {

    Context context;
    String[] routines;

    public DashboardAdapter(Context context, String[] routines) {
        this.context = context;
        this.routines = routines;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_layout_recyclerview_dashboard,parent,false);
        return new myViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.textView.setText(routines[position]);
    }

    @Override
    public int getItemCount() {
        return routines.length;
    }
}
