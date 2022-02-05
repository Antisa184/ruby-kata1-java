package main.service;

import main.domain.ReadingMaterial;

import java.util.Comparator;

public class SortReadingMaterialByTitle implements Comparator<ReadingMaterial> {
    public int compare(ReadingMaterial a, ReadingMaterial b){
        return a.title.compareTo(b.title);
    }
}
