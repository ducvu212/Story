package com.example.vuminhduc.story;

/**
 * Created by vuminhduc on 28/03/2017.
 */

public class ItemTopic {

    private String topic;
    private int idImg ;

    public ItemTopic() {
    }

    public ItemTopic(int idImg, String topic) {
        this.topic = topic;
        this.idImg = idImg;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }
}
