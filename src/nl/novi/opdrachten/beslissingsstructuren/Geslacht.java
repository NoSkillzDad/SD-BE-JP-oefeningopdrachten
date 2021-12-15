package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Objects;
import java.util.Scanner;

public class Geslacht {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        String[] gender = {"man", "woman"};

        System.out.println("Wat is uw geslacht?");
        String geslacht = userInputScanner.nextLine();

        if (Objects.equals(geslacht, gender[0])) {
            System.out.println("Hello Sir!");
        } else {
            if (Objects.equals(geslacht, gender[1])) {
                System.out.println("Hello Miss");
            } else {
                System.out.println("I'm a bit incomplete. Sorry!");
            }
        }
        /*
        Hier boven heeft de gebruiker zijn geslacht ingevoerd. Print met behulp van een beslissingsstructuur (if/else)
        de volgende berichten:
        Wanneer de gebruiker een 'man' is: "Dag meneer."
        Wanneer de gebruiker een 'vrouw' is": "Dag mevrouw."
        In alle andere gevallen: "Dag persoon."

        Bonus: Lukt het je om de code zo te maken dat hoofdletters genegeerd worden?
         */

    }

}
