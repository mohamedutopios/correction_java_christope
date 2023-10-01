package org.example;

import org.example.exercice1.ArrayTab;
import org.example.exercice2.tools.CercleComparator;
import org.example.exercice3.ListeTriee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayTab.main();
//        CercleComparator.main();

        ArrayList<String> newList = new ArrayList<>();
        newList.add("hello");
        newList.add("allons");
        newList.add("y");
        newList.add("bye");

        ListeTriee list = new ListeTriee(newList);
        list.affiche();

        list.add("ailleurs");
        list.affiche();

        list.add("chenille");
        list.affiche();

        list.add("zebre");
        list.affiche();

    }
}