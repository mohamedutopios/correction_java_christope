package org.example.exercice2.tools;

import org.example.exercice2.Cercle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CercleComparator {
    public static void main(){
        List<Cercle> cercles = new ArrayList<>();

        cercles.add(new Cercle(5, 3, 20));
        cercles.add(new Cercle(1, 7, 25));
        cercles.add(new Cercle(1, 7, 5));
        cercles.add(new Cercle(15, 10, 15));
        cercles.add(new Cercle(-3, 1, 2));

        for (Cercle c: cercles) {
            System.out.println(c);
        }

        Collections.sort(cercles, Comparator.comparing(Cercle::getX).thenComparingDouble(Cercle::getRayon));
        System.out.println();
        System.out.println("Tableau trié selon abscisse/ rayon");
        System.out.println();

        for (Cercle c: cercles) {
            System.out.println(c);
        }

    }
}
