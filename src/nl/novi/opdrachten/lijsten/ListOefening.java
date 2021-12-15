package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

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

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
        printElements(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        printPos(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
//        String newClub = "Barcelona";
        String newClub = "Ajax";

        if (checkClub(clubNames, newClub)) {
            System.out.println("Football Club" + newClub + " already in our list");
        } else {
            clubNames.add(newClub);
            System.out.println("FC " + newClub + " added to club list");
        }

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        newClub = "Barcelona";
        int posNewFC;
        posNewFC = checkPosList(clubNames, newClub);
        if (posNewFC > 0) {
            System.out.println("The FC " + newClub + "is in position " + posNewFC + " of the list");
        } else {
            System.out.println("FC "+ newClub + " not found");
        }

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortList(clubNames, "Ajax");

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        sortReverseList(clubNames, "PSV");
    }

    public static void printElements(List<String> list2Print) {
        for (String line : list2Print) {
            System.out.println(line);
        }
    }

    public static void printPos(List<String> list2Print) {
        for (int i=0; i < list2Print.size(); i++) {
            System.out.println(i + 1 + " - " + list2Print.get(i));
        }
    }

    public static boolean checkClub(List<String> list2Check, String value2Check) {
        return list2Check.contains(value2Check);
    }

    public static int checkPosList(List<String> list2Check, String value2Check) {
        if (checkClub(list2Check, value2Check)) {
            return list2Check.indexOf(value2Check) + 1;
        } else return 0;
    }

    public static void sortList(List<String> list2Sort, String ajaxFirst) {

        Collections.sort(list2Sort);
        int ajaxPos = list2Sort.indexOf(ajaxFirst);

        for (int i = 0; i < ajaxPos; i++) {
            list2Sort.remove(0);
        }
    }

    public static void sortReverseList(List<String> list2Sort, String psvLast) {

        Collections.sort(list2Sort);
        int psvPos = list2Sort.indexOf(psvLast);

        for (int i = psvPos; i <= list2Sort.size(); i++) {
            list2Sort.remove(list2Sort.size() - 1);
        }
    }

}
