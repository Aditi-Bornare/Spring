package com.user.beans;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userID;
    private String name;
    private String mobno;

    List<Contact> contact=new ArrayList<>();

    public User() {
    }

    public User(Long userID, String name, String mobno, List<Contact> contact) {
        this.userID = userID;
        this.name = name;
        this.mobno = mobno;
        this.contact = contact;
    }

    public User(Long userID, String name, String mobno) {
        this.userID = userID;
        this.name = name;
        this.mobno = mobno;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
