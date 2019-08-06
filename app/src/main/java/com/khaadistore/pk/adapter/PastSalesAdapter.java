package com.khaadistore.pk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.khaadistore.pk.R;

public class PastSalesAdapter extends BaseAdapter {
    private Context context;

    public PastSalesAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_item_sales, null);
        return view;
    }
}
