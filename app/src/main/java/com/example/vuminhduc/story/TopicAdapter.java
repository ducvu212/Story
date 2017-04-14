package com.example.vuminhduc.story;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vuminhduc on 28/03/2017.
 */

public class TopicAdapter extends BaseAdapter {

    private  InterfaceItem mInter;

    public TopicAdapter(InterfaceItem inter) {
        mInter = inter;

    }

    @Override
    public int getCount() {
        return mInter.getCount();
    }

    @Override
    public ItemTopic getItem(int position) {
        return mInter.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        convertView = inflater.inflate(R.layout.topics, parent, false) ;
        TextView tv_name = (TextView) convertView.findViewById(R.id.tv_nameTopic);
        ImageView imv_topic = (ImageView) convertView.findViewById(R.id.imv_topic);
        ItemTopic itemTopic = mInter.getItem(position);

        tv_name.setText(itemTopic.getTopic());
        imv_topic.setImageResource(itemTopic.getIdImg());

        return convertView;
    }

    public interface  InterfaceItem {
        int getCount();
        ItemTopic getItem(int possition);
    }
}
