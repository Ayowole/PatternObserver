package com.ayowole.observer;

import java.time.LocalDateTime;

class News {

    private String title;
    private String description;
    private LocalDateTime creationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    
    @Override
    public String toString() {
        return "[" + title + ", " + description + ", " + creationDate + "]";
    }

}
