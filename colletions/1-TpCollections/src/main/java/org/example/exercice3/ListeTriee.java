package org.example.exercice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class ListeTriee {
    public ArrayList<String> listTriee = new ArrayList<>();

    public ListeTriee(ArrayList<String> listTriee) {
        Collections.sort(listTriee);
        this.listTriee = listTriee;
    }

    public ListeTriee()
    {

    }

    public void affiche()
    {
        for (String s: listTriee) {
            System.out.println(s);
        }
    }

    public void add(String s)
    {
        ListIterator<String> it = listTriee.listIterator();
        boolean check = false;

        while(it.hasNext())
        {
            String value = it.next();
            int comparaison = s.compareTo(value);
            if(comparaison<0)
            {
                listTriee.add(it.nextIndex()-1, s);
                check = true;
                break;
            }
        }

        if(!check)
        {
            listTriee.add(s);
        }
    }



}
