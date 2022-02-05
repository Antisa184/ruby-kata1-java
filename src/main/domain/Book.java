package main.domain;

import main.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Book extends ReadingMaterial{
    public String description;

    public Book() {
    }

    public Book(String title, String isbn, List<String> authors, String description) {
        super(title, isbn, authors);
        this.description = description;
    }

    public static void readBooks(Scanner myReader) {
        String tp;
        List<String> tpList;
        List<Book> bookList = new ArrayList<>();
        while(myReader.hasNextLine()){
            tp = myReader.nextLine();
            tpList = Arrays.stream(tp.split(";")).toList();
            Book newBook = new Book();
            newBook.setTitle(tpList.get(0));
            newBook.setIsbn(tpList.get(1));
            newBook.setAuthors(List.of(tpList.get(2).split(",")));
            newBook.setDescription(tpList.get(3));
            bookList.add(newBook);
            Main.addReadingMaterial(newBook);
        }
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
                ", authors=" + authors +
                ", description='" + description + '\'' +
                '}';
    }
}
