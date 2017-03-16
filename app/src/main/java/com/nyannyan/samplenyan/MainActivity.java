package com.nyannyan.samplenyan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataModel> DataModelList;
    RvAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialized rv
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        //Initialize list
        DataModelList = new ArrayList<>();
        Log.e("e","before " + DataModelList.size());

        //setup adapter
        mAdapter = new RvAdapter(this,DataModelList);

        //enable this for linear layout
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        //this for grid layout
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager
                .HORIZONTAL, false);
        //set the layout manager to rv
        rv.setLayoutManager(mLayoutManager);
        //for rv animation
        rv.setItemAnimator(new DefaultItemAnimator());
        //set adapter to the rv
        rv.setAdapter(mAdapter);

        prepareDataModelData();

        Log.e("e","after " + DataModelList.size());

    }


    private void prepareDataModelData() {
        //Hardcore list

        DataModel dataModel = new DataModel("Al fatihah", "1", R.drawable.bag);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Ikhlas", "2", R.drawable.camera);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Baqarah", "3", R.drawable.chat);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Ali Imran", "4", R.drawable.facebook);
        DataModelList.add(dataModel);

        dataModel = new DataModel("An Nisa", "5", R.drawable.twitter);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Ma'idah", "6", R.drawable.settings);
        DataModelList.add(dataModel);

        dataModel = new DataModel("At Tur", "7", R.drawable.folder);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Qamar", "8", R.drawable.settings);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Ar Rahman", "9", R.drawable.chat);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Waqi'ah", "10", R.drawable.home);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Hadid", "11", R.drawable.chat);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Mumtahanah", "12", R.drawable.camera);
        DataModelList.add(dataModel);

        dataModel = new DataModel("As Saff", "13", R.drawable.twitter);
        DataModelList.add(dataModel);

        dataModel = new DataModel("Al Jumu'ah", "14", R.drawable.folder);
        DataModelList.add(dataModel);

        dataModel = new DataModel("At Talaq", "15", R.drawable.folder);
        DataModelList.add(dataModel);

        dataModel = new DataModel("At Tahrim", "16", R.drawable.folder);
        DataModelList.add(dataModel);

        mAdapter.notifyDataSetChanged();
    }
}
