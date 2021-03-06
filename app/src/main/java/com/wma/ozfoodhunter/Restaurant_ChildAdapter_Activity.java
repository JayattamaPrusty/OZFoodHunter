package com.wma.ozfoodhunter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.wma.ozfoodhunter.Adapters.RestaurantSectionAdapter;
import com.wma.ozfoodhunter.BeanClasses.RestaurantItemBeans;

import java.util.ArrayList;

public class Restaurant_ChildAdapter_Activity extends AppCompatActivity implements View.OnClickListener{
    Toolbar toolbar;
    ActionBar actionbar;
    RestaurantSectionAdapter adapter;
    private ArrayList<RestaurantItemBeans> items;
    Button continue_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__child_adapter);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        actionbar = getSupportActionBar();
//        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);
//        actionbar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        continue_btn=(Button)findViewById(R.id.continue_btn);
        continue_btn.setOnClickListener(this);
        items=new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_child_section);
        adapter = new RestaurantSectionAdapter(this, items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.continue_btn:
                finish();
                break;
        }

    }
}
