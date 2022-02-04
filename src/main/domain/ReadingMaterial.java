package main.domain;

import java.util.Arrays;

public class ReadingMaterial {
    public String title;
    public String isbn;
    public String[] authors;

    public ReadingMaterial() {
    }

    public ReadingMaterial(String title, String isbn, String[] authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "ReadingMaterial{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
