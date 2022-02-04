package main;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
                        if (line.split(";")[2]=="lastname") readAuthors(f);
                        if (line.split(";")[3]=="description") readBooks(f);
                        if (line.split(";")[3]=="publishedAt") readMagazines(f);

                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                }

            }
        }
        else{
            System.out.println("No files with .csv extension in directory");
        }
    }
}
