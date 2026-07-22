package com.example.myapplication;

public class TextNote extends Note {

    public TextNote(String title, String content) {
        super(title, content);
    }

    @Override
    public String getSummary() {
        String content = getContent();
        String shortContent = content.length() > 30
                ? content.substring(0, 30) + "..."
                : content;
        return "[" + formatDate() + "] " + getTitle() + " (ข้อความ): " + shortContent;
    }
}
