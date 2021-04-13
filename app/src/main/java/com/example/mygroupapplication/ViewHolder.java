package com.example.mygroupapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView tv1;
    TextView tv2;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tv1 = itemView.findViewById(R.id.tv_name);
        tv2 = itemView.findViewById(R.id.tv_number);
    }

    public void onBind(MembersNames info) {
        tv1.setText(info.name);
        tv2.setText(String.valueOf(info.number));
    }
}
