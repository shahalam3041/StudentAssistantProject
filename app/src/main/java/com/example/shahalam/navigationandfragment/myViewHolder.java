package com.example.shahalam.navigationandfragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    Context context;
    TextView textView;
    public myViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;

        itemView.setOnClickListener(this);
        textView = itemView.findViewById(R.id.textViewId);

    }

    @Override
    public void onClick(View v) {
        int position = getAdapterPosition();
        if(position==0)
        {
            Intent intent = new Intent(context, BusRoutineActivity.class);
            context.startActivity(intent);
        }
        if(position==1)
        {
            Intent intent = new Intent(context, ClassRoutine.class);
            context.startActivity(intent);
        }
        if(position==2)
        {
            Intent intent = new Intent(context, ExamRoutineActivity.class);
            context.startActivity(intent);
        }
    }
}
