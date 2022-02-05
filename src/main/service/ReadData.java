package main.service;

import main.domain.Author;
import main.domain.Book;
import main.domain.Magazine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ReadData {
    public static void readData() throws Exception{
        String path = "data/";
        File dir = new File(path);
        File[] dirListing = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".csv");
            }
        });
        if(dirListing!=null){
            for(File f: dirListing){
                try {
                    Scanner myReader = new Scanner(f);
                    String line="";
                    if(myReader.hasNextLine()){
                        line= myReader.nextLine();
                        if (line.split(";")[2]=="lastname") Author.readAuthors(myReader);
                        if (line.split(";")[3]=="description") Book.readBooks(myReader);
                        if (line.split(";")[3]=="publishedAt") Magazine.readMagazines(myReader);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                }

            }
        }
        else {
            System.out.println("No files with .csv extension in directory");
        }
    }
}
