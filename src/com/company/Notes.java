package com.company;

public class Notes {

    private int id;
    private String title;
    private String text;
    private long timestamp;


    public Notes() { }

    public Notes(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Notes(String text) {
        this.text = text;
    }

    public Notes(String title, String text, long timestamp) {
        this.title = title;
        this.text = text;
        this.timestamp = timestamp;
    }

    public Notes(String title, String text) {
        this.title = title;
        this.text = text;


    }

    public Notes(int id, String title, String text, long timestamp) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.timestamp = timestamp;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", timestamp=" + timestamp +

                '}';
    }
}