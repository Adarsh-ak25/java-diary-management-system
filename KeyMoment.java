package com.diary;
public class KeyMoment {

    private String title;
    private String description;
    private String date;
    private String emotion;

    public KeyMoment(
            String title,
            String description,
            String date,
            String emotion) {

        this.title = title;
        this.description = description;
        this.date = date;
        this.emotion = emotion;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;   
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public String toString() {

        return "Key Moment\n"
                + "Title: " + title + "\n"
                + "Description: " + description + "\n"
                + "Date: " + date + "\n"
                + "Emotion: " + emotion;
    }
}
