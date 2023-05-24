package fr.diginamic.listes;

import java.util.Comparator;

public class ComparatorHabitants implements Comparator<Ville>
{
    @Override
    public int compare(Ville ville, Ville t1) {
        if(ville.getPop()>t1.getPop())
            return 1;
        else if(ville.getPop()<t1.getPop())
            return -1;
        return 0;
    }
}