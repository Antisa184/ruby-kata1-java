package main.service;

import main.domain.ReadingMaterial;

import java.util.Collections;
import java.util.List;

public class PrintReadingMaterial {
    public static void printReadingMaterial(List<ReadingMaterial> readables, int mode, String param){
        if(readables==null){ System.out.println("The given list is empty."); return;}
        if(mode==1) Collections.sort(readables,new SortReadingMaterialByTitle());
        for (ReadingMaterial r: readables) {
            if( (mode==1 || mode==4) || (mode==2 && r.isbn==param) || (mode==3 && r.authors.contains(param))){
                    System.out.println(r.toString());
                }
            }
        }
    }

