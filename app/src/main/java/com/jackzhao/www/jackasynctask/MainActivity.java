package com.jackzhao.www.jackasynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_listview_items, new ArrayList<String>());
        listView = (ListView) findViewById(R.id.lv_mainlist);
        listView.setAdapter(adapter);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        new AsyncTaskHelper(listView).execute();
    }

//    class AsyncTaskHelper extends AsyncTask<Void, String, Void> {
//
//
//    }

}
