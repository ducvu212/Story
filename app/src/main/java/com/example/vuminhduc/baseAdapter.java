package com.example.vuminhduc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vuminhduc.story.R;

/**
 * Created by vuminhduc on 28/03/2017.
 */

public class baseAdapter extends BaseAdapter {

    private Itemstory mInter ;

    public baseAdapter(Itemstory Inter) {
        mInter = Inter;
    }

    @Override
    public int getCount() {
        return mInter.getCount();
    }

    @Override
    public Object getItem(int position) {
        return mInter.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        convertView = inflater.inflate(R.layout.story, parent, false) ;
        TextView tv = (TextView) convertView.findViewById(R.id.content);
        ItemStory itemStory = mInter.getItem(position);
        tv.setText(itemStory.getTitle());
        return convertView;
    }

    public interface Itemstory {
       int getCount();
       ItemStory getItem(int position);
    }
}
