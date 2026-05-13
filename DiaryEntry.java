package com.diary;

public class DiaryEntry {

    private String date;
    private String content;
    private boolean important;

    public DiaryEntry(String date, String content, boolean important) {

        this.date = date;
        this.content = content;
        this.important = important;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public boolean isImportant() {
        return important;
    }
}