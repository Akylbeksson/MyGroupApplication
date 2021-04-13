package com.example.mygroupapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Toolbar toolbar;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<MembersNames> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recv);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0, new MembersNames(1, "Narine Wolfsberg"));
        list.add(1, new MembersNames(2, "Nursultan Osmonov"));
        list.add(2, new MembersNames(3, "Bekjan Sheishenbekov"));
        list.add(3, new MembersNames(4, "Nuraiym Ibraeva"));
        list.add(4, new MembersNames(5, "Asel Nolastname"));
        list.add(5, new MembersNames(6, "Aiperi Ruslanbekova"));
        list.add(6, new MembersNames(7, "Kanykei Kazakova"));
        list.add(7, new MembersNames(8, "Anuar Musaev"));
        list.add(8, new MembersNames(9, "Emir Mamaev"));
        list.add(9, new MembersNames(10, "Islamidin Arziev"));
        list.add(10, new MembersNames(11, "Beknazar Urmatbekov"));
        list.add(11, new MembersNames(12, "Husein Sharipov"));
        list.add(12, new MembersNames(13, "Omar Halikov"));
        list.add(13, new MembersNames(14, "Aknazar Akylbeksson"));

        adapter.addText(list);

    }
}