package com.jackzhao.www.jackasynctask;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.lang.ref.WeakReference;

public class AsyncTaskHelper extends AsyncTask<Void, String, Void> {

    private ArrayAdapter<String> adapter;
    private WeakReference ref_listview;
    private ListView listView;

    public AsyncTaskHelper(ListView lv) {
        ref_listview = new WeakReference(lv);
        listView = (ListView) ref_listview.get();
    }


    @Override
    protected Void doInBackground(Void... voids) {

        for (String item : DataHelper.data) {
            publishProgress(item);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        adapter = (ArrayAdapter<String>) listView.getAdapter();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
    }

    @Override
    protected void onProgressUpdate(String... values) {
        adapter.add(values[0]);
    }

}
