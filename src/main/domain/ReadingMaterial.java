package main.domain;

import main.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadingMaterial {
    public String title;
    public String isbn;
    public List<String> authors;

    public List<String> authorsByName(List<String> authors){
        List<String> authorNames=new ArrayList<>();
        for(String s: authors){
            for(Author author: Main.authors){
                if(author.email.equals(s)) authorNames.add(author.firstName+" "+author.lastName);
            }
        }
        return authorNames;
    };

    public ReadingMaterial() {
    }

    public ReadingMaterial(String title, String isbn, List<String> authors) {
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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "ReadingMaterial{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }
}
