package com.example.recyclerviewpart1.model;

public class Contact {

    private String stringName;
    private String stringPhone;
    private int intPhoto;

    public Contact() {
    }

    public Contact(String stringName, String stringPhone, int intPhoto) {
        this.stringName = stringName;
        this.stringPhone = stringPhone;
        this.intPhoto = intPhoto;
    }

    //Getter

    public String getStringName() {
        return stringName;
    }

    public String getStringPhone() {
        return stringPhone;
    }

    public int getIntPhoto() {
        return intPhoto;
    }

    //Setter

    public void setStringName(String stringName) {
        this.stringName = stringName;
    }

    public void setStringPhone(String stringPhone) {
        this.stringPhone = stringPhone;
    }

    public void setIntPhoto(int intPhoto) {
        this.intPhoto = intPhoto;
    }
}
