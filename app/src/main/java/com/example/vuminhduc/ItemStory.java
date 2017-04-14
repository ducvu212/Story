package com.example.vuminhduc;

/**
 * Created by vuminhduc on 28/03/2017.
 */

public class ItemStory {

    private String title ;
    private String content;

    public ItemStory() {
    }

    public ItemStory(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
