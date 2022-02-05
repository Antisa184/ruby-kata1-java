package main.domain;

import main.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Author {
    public String email;
    public String firstName;
    public String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author() {
    }

    public Author(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static List<Author> readAuthors(Scanner myReader){
        Main.test="Debela Masna kurcina.";
        String tp;
        List<String> tpList;
        List<Author> authorList = new ArrayList<>();
        while(myReader.hasNextLine()){
            tp = myReader.nextLine();
            tpList = Arrays.stream(tp.split(";")).toList();
            Author newAuthor = new Author();
            newAuthor.setEmail(tpList.get(0));
            newAuthor.setFirstName(tpList.get(1));
            newAuthor.setLastName(tpList.get(2));
            authorList.add(newAuthor);
            Main.authors.add(newAuthor);
        }

        return authorList;
    }
}
