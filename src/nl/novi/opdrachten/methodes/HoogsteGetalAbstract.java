package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("From the following randomized list of numbers: ");
        System.out.println(numbers);
        System.out.println("\n the highest one is: " + highestNumnber(numbers, 'h'));
        System.out.println("\n the highest one is: " + numbers.get(highestNumnber(numbers, 'p')));
    }


    //Slightly modifed this method to return either the highest number or the position of the highest number in the Array
    public static int highestNumnber(List<Integer> numbers, char function) {
        int highest = numbers.get(0);
        int pos = 0;

        for (int i = 1; i <= numbers.size() - 1; i++) {
            if (highest < numbers.get(i)) {
                highest = numbers.get(i);
                pos = i;
            }
        }
        switch (function) {
            case 'h':
                return highest;
            case 'p':
                return pos;
            default:
                return highest; // Sames as 'h' but could be used to implement exception errors.
        }
    }

}
