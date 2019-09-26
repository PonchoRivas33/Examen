package com.example.examen;

public class ListViewItem {

    private int imageResource;

    public ListViewItem(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }

    private String title;

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }
}
