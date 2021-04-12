package com.example.cards;

public class Sport {
    private String title;
    private String info;
    private final int imageResource;

//    create constructor
//    alt + insert > constructor > select all (ctrl + a) > enter

    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
//    create getters which are function that get data from class
//    alt + insert > getters > ctrl + a > enter

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }
}
