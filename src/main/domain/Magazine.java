package main.domain;

import java.util.Arrays;
import java.util.Date;

public class Magazine extends ReadingMaterial{
    public Date publishedAt;

    public Magazine() {
    }

    public Magazine(String title, String isbn, String[] authors, Date publishedAt) {
        super(title, isbn, authors);
        this.publishedAt = publishedAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
