package com.example.demo.models;

import java.io.Serializable;
import java.util.Date;


public class Book implements Serializable{
    //private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private int id;
    private Date read;

    public Book() {
    }

    public Book(String title, String author, int id) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int id, Date d) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.read = d;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRead() {
        return read;
    }

    public void setRead(Date read) {
        this.read = read;
    }


}