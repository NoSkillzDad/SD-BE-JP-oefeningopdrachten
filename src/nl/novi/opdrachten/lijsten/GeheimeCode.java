package nl.novi.opdrachten.lijsten;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
//        laResistanceMembers = addMembers(laResistanceMembers, "Piet");

//        System.out.println(laResistanceMembers);

        System.out.println("Original: " + laResistanceMembers);

        laResistanceMembers = processList(laResistanceMembers, "encode");

        System.out.println("Encrypted: " + laResistanceMembers);

        laResistanceMembers = processList(laResistanceMembers, "decode");

        System.out.println("Decrypted: " + laResistanceMembers);

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static List<String> addMembers(List<String> members, String name) {

        if (!members.contains(name)) {
            members.add(name);
        }
        return members;
    }

    private static String encrypt(String member) {

        String encodingKey = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int modifierLC = 1;
        int modifierUC = 101;

        StringBuilder tempName = new StringBuilder();

        char[] ch = member.toCharArray();

        Integer code = 0;

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a') && (ch[i] <= 'z')) {
                code = encodingKey.indexOf(member.charAt(i)) + modifierLC;
            }
            if ((ch[i] >= 'A') && (ch[i] <= 'Z')) {
                code = encodingKey.indexOf(member.charAt(i)) + modifierUC - (encodingKey.length() / 2);
            }
            if (i < (ch.length - 1)) {
                tempName.append(code.toString()).append('-');
            } else {
                tempName.append(code.toString());
            }
        }

        member = tempName.toString();
        return member;
    }

    private static String decrypt(String member) {

        String encodingKey = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder tempName = new StringBuilder();

        int tempNumber = 0;
        char tempChar;

        List<String> wholeNumbers = Arrays.asList(member.split("-"));

        for (String numberStr : wholeNumbers) {
            tempNumber = Integer.parseInt(numberStr);
            tempChar = (tempNumber > 100) ? (encodingKey.charAt(tempNumber - 75)) : (encodingKey.charAt(tempNumber - 1));
            tempName.append(tempChar);
            member = tempName.toString();
        }

        return member;
    }


    public static List<String> processList(List<String> members, String action) {

        List<String> tempMembers = new ArrayList<>();

        if (action.equals("encode")) {
            for (int i = 0; i < members.size(); i++) {
                tempMembers.add(encrypt(members.get(i)));
            }
        } else {
            if (action.equals("decode")) {
                for (int i = 0; i < members.size(); i++) {
                    tempMembers.add(decrypt(members.get(i)));
                }
            }
        }
        return tempMembers;
    }

}
