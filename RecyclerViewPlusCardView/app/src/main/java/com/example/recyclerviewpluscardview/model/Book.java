package com.example.recyclerviewpluscardview.model;

public class Book {

    private String stringTitle;
    private String stringCategory;
    private String stringDescription;
    private int intThumbnail;

    public Book() {
    }

    public Book(String stringTitle, String stringCategory, String stringDescription, int intThumbnail) {
        this.stringTitle = stringTitle;
        this.stringCategory = stringCategory;
        this.stringDescription = stringDescription;
        this.intThumbnail = intThumbnail;
    }

    //Getters

    public String getStringTitle() {
        return stringTitle;
    }

    public String getStringCategory() {
        return stringCategory;
    }

    public String getStringDescription() {
        return stringDescription;
    }

    public int getIntThumbnail() {
        return intThumbnail;
    }

    //Setters

    public void setStringTitle(String stringTitle) {
        this.stringTitle = stringTitle;
    }

    public void setStringCategory(String stringCategory) {
        this.stringCategory = stringCategory;
    }

    public void setStringDescription(String stringDescription) {
        this.stringDescription = stringDescription;
    }

    public void setIntThumbnail(int intThumbnail) {
        this.intThumbnail = intThumbnail;
    }
}
