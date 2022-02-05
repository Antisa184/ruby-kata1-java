package main.domain;

import main.Main;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class Magazine extends ReadingMaterial{
    public Date publishedAt;

    public Magazine() {
    }

    public Magazine(String title, String isbn, List<String> authors, Date publishedAt) {
        super(title, isbn, authors);
        this.publishedAt = publishedAt;
    }

    public static void readMagazines(Scanner myReader) throws Exception{
        String tp;
        List<String> tpList;
        List<Magazine> magazinesList = new ArrayList<>();
        while(myReader.hasNextLine()){
            tp = myReader.nextLine();
            tpList = Arrays.stream(tp.split(";")).toList();
            Magazine newMagazine = new Magazine();
            newMagazine.setTitle(tpList.get(0));
            newMagazine.setIsbn(tpList.get(1));
            newMagazine.setAuthors(List.of(tpList.get(2).split(",")));
            newMagazine.setPublishedAt(new SimpleDateFormat("dd.mm.yyyy").parse(tpList.get(3)));
            magazinesList.add(newMagazine);
            Main.addReadingMaterial(newMagazine);
        }
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
                ", authors=" + authors +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
