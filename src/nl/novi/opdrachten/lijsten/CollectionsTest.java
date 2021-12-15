package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        System.out.println(clubNames);

        Collections.sort(clubNames);

        System.out.println("sorted");
        System.out.println(clubNames);

        int ajaxPos = clubNames.indexOf("Ajax");
        System.out.println("Ajax: " + ajaxPos);

        System.out.println("listed manually 0 - 4");
        System.out.println(clubNames.get(0));
        System.out.println(clubNames.get(1));
        System.out.println(clubNames.get(2));
        System.out.println(clubNames.get(3));
        System.out.println(clubNames.get(4));

        clubNames.remove(0);
        clubNames.remove(0);

        System.out.println("Removed");
        System.out.println(clubNames);

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");
    }

}
