package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {
    public static void main(String[] sammieKijkOmhoog) {

        int chosenNumber = 50;
        if (divBy5(chosenNumber)) {
            System.out.println(chosenNumber + " is a multiple of 5");
        }
    }

    public static boolean divBy5(int number) {

        switch (number % 5) {
            case 0: return true;
            default: return false;
        }
    }
}
