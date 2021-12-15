package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();
        List<String> curstomerNamesUpdated = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        curstomerNamesUpdated = processName(curstomerNames);

        System.out.println(curstomerNames);

        curstomerNames.clear();
        curstomerNames = curstomerNamesUpdated;

        System.out.println(curstomerNames);
    }

    public static String capitalize(String name) {

        if (name.matches("\\w+\\.?")) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        } else {
            System.out.println(name.indexOf("-"));
            String[] splitted = name.split("-");
            splitted[1] = splitted[1].substring(0, 1).toUpperCase() + splitted[1].substring(1);
            name = splitted[0] + "-" + splitted[1];
        }

        return name;
    }

    public static List<String> processName(List<String> names2Fix) {

        List<String> tempNames = new ArrayList<>();

        for (String wholeName : names2Fix) {
            String[] splitted = wholeName.split(" ");
            String tempName = "";

            splitted[0] = capitalize(splitted[0]);
            splitted[splitted.length - 1] = capitalize(splitted[splitted.length - 1]);

            for (int i = 0; i < splitted.length - 1; i++) {
                tempName = tempName + splitted[i] + " ";
            }
            wholeName = tempName + splitted[splitted.length - 1];

            tempNames.add(wholeName);
        }
        return(tempNames);
    }
}

//capitalizeStr = StringUtils.capitalize(str);
//org.apache.commons.lang.StringUtils

