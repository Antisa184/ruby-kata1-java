package main;

import main.domain.Author;
import main.domain.ReadingMaterial;
import main.service.ReadData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.service.PrintReadingMaterial.printReadingMaterial;

public class Main {
    public static List<ReadingMaterial> readingMaterials = new ArrayList<>();
    public static List<Author> authors = new ArrayList<>();

    public static void addReadingMaterial(ReadingMaterial readable){
        readingMaterials.add(readable);
    }
    public static void addAuthors(Author author){
        authors.add(author);
    }

    public static void main(String[] args) throws IOException {
        try {
            ReadData.readData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(true){
            System.out.println("Hello!\nTo choose an option write the number associated with the option and press Enter. (eg. 1)\n"
                    +"1. Print out all books and magazines with all their details.\n"
                    +"2. Find a book or magazine by its isbn.\n"
                    +"3. Find all books and magazines by their authors email.\n"
                    +"4. Print out all books and magazines with all their details sorted by title.\n"
                    +"Type 'exit' to stop the program.\n");
            String input;
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            if (input.equals("exit")){System.out.println("Goodbye!\n"); break;}
            if (input.equals("1")){
                printReadingMaterial(readingMaterials,1,"");
            }
            if (input.equals("2")){
                System.out.println("Input the isbn: ");
                input = in.nextLine();
                printReadingMaterial(readingMaterials, 2, input);
            }
            if (input.equals("3")){
                System.out.println("Input author's email: ");
                input = in.nextLine();
                printReadingMaterial(readingMaterials, 3, input);
            }
            if (input.equals("4")){
                printReadingMaterial(readingMaterials,4,"");
            }
        }
    }
}
