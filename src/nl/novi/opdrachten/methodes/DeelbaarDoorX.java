package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {
    public static void main(String[] args) {
        int num = 13;
        int div = 3;

        if (num % div == 0) {
            System.out.println(num + " is divisible by " + div);
        } else {
            System.out.println(num + " is not divisible by " + div);
            System.out.println("Try " + closerDiv(num, div) + " instead?");
        }
    }

    public static int closerDiv(int number, int divisible) {
        int closestNumber = divisible;

        if (number <= divisible) {
            return closestNumber;
        }
        else {
            closestNumber = ((number % divisible <= divisible/2)) ? (number - (number % divisible)) : (number + divisible - (number % divisible));
            return closestNumber;
        }
    }
// another way of solving it is in https://stackoverflow.com/questions/29453717/closest-divisible-integer
}
