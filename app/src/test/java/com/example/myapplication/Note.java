package com.example.myapplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Note {
    //Attributes
    private String title;
    private String content;
    private Date createdDate;

    public Note(String title, String content){
        this.title = title;
        this.content = content;
        this.createdDate = new Date();
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public Date getCreatedDate(){
        return createdDate;
    }
    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }

    public String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return sdf.format(createdDate);
    }
    abstract String getSummary();

}
