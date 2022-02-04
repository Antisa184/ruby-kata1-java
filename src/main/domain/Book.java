package main.domain;

import java.util.Arrays;

public class Book extends ReadingMaterial{
    public String description;

    public Book() {
    }

    public Book(String title, String isbn, String[] authors, String description) {
        super(title, isbn, authors);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", description='" + description + '\'' +
                '}';
    }
}
