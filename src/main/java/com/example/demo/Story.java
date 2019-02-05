package com.example.demo;


import java.util.Date;


public class Story {

    private long id;
    private String title;
    private String content;
    private Date posted;
    private Blogger blogger;

    public Story(long id, String title, String content, Date posted, Long bloggerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = new Blogger(bloggerId, "Krisz", 21);
    }

    private Story(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }


    @Override
    public String toString() {
        return "Story{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", posted=" + posted +
                ", blogger='" + blogger + '\'' +
                '}';
    }
}
