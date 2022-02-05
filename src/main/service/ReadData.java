package main.service;

import main.Main;
import main.domain.Author;
import main.domain.Book;
import main.domain.Magazine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class ReadData {
    public static void readData() throws Exception{

        String path = "src/main/data";
        File dir = new File(path);
        File[] dirListing = dir.listFiles();
        if(dirListing!=null){
            for(File f: dirListing){
                try {
                    Scanner myReader = new Scanner(f);
                    String line="";
                    if(myReader.hasNextLine()){
                        line= myReader.nextLine();

                        if (line.split(";").length==3 && line.split(";")[2].equals("lastname")) {Author.readAuthors(myReader);}
                        else if (line.split(";").length==4 && line.split(";")[3].equals("description")) {Book.readBooks(myReader);}
                        else if (line.split(";").length==4 && line.split(";")[3].equals("publishedAt")) {Magazine.readMagazines(myReader);}
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
