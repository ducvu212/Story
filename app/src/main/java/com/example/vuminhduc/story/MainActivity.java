package com.example.vuminhduc.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.vuminhduc.List_topic.DanGian;
import com.example.vuminhduc.List_topic.GiaDinh;
import com.example.vuminhduc.List_topic.TieuLam;
import com.example.vuminhduc.List_topic.TinhYeu;
import com.example.vuminhduc.List_topic.Vova;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        TopicAdapter.InterfaceItem, AdapterView.OnItemClickListener {
    
    public static ListView listView;
    TopicAdapter topicAdapter;
    List<ItemTopic> mItemtopic ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        initItem();
    }

    private void initItem() {

        mItemtopic = new ArrayList<>() ;
        mItemtopic.add(new ItemTopic(R.drawable.im_1, "Vova"));
        mItemtopic.add(new ItemTopic(R.drawable.im_2, "Dân gian"));
        mItemtopic.add(new ItemTopic(R.drawable.im_3, "Gia đình"));
        mItemtopic.add(new ItemTopic(R.drawable.im_4, "Tình yêu"));
        mItemtopic.add(new ItemTopic(R.drawable.im_5, "Tiếu lâm"));
        mItemtopic.add(new ItemTopic(R.drawable.im_6, "Công sở"));
        mItemtopic.add(new ItemTopic(R.drawable.im_7, "Học sinh"));
        mItemtopic.add(new ItemTopic(R.drawable.im_10, "Truyện ngắn"));
        mItemtopic.add(new ItemTopic(R.drawable.im_12, "Cười 18+"));
        mItemtopic.add(new ItemTopic(R.drawable.im_13, "Y học"));
        mItemtopic.add(new ItemTopic(R.drawable.im_14, "Tam Quốc"));
        mItemtopic.add(new ItemTopic(R.drawable.im_15, "Thế giới"));
        mItemtopic.add(new ItemTopic(R.drawable.im_22, "Tây du kí chế"));
        mItemtopic.add(new ItemTopic(R.drawable.im_27, "Truyện khác"));
        mItemtopic.add(new ItemTopic(R.drawable.im_28, "Cười ngược"));

    }

    private void initComponents() {
        listView = (ListView) findViewById(R.id.lv_topic);
        initItem();
        topicAdapter = new TopicAdapter(this) ;
        listView.setAdapter(topicAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public int getCount() {
        if(mItemtopic == null) {
            return 0;
        }
        return mItemtopic.size();
    }

    @Override
    public ItemTopic getItem(int possition) {
        return mItemtopic.get(possition);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        topicAdapter.notifyDataSetChanged();

        for(int i = 0; i < mItemtopic.size(); i++) {
            switch (position) {
                case 0:
                    Intent intent = new Intent(this,Vova.class) ;
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(this,DanGian.class) ;
                    startActivity(intent1);
                    break;

                case 2:
                    Intent intent2 = new Intent(this,GiaDinh.class) ;
                    startActivity(intent2);
                    break;

                case 3:
                    Intent intent3 = new Intent(this,TinhYeu.class) ;
                    startActivity(intent3);
                    break;

                case 4:
                    Intent intent4 = new Intent(this,TieuLam.class) ;
                    startActivity(intent4);
                    break;

                default:
                    break;

            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        return;
    }
}
