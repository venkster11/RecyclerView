package com.venkat.myrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager LayoutManager=new LinearLayoutManager(this);
        LayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(LayoutManager);

        List<ModelClass> modelClassList=new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 1","hello this is user1"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 2","hello this is user2"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 3","hello this is user3"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 4","hello this is user4"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 5","hello this is user5"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 6","hello this is user6"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 7","hello this is user7"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 8","hello this is user8"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 9","hello this is user9"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"User 10","hello this is user10"));


        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
}
