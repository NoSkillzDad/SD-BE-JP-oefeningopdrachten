package nl.novi.opdrachten.lijsten;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VersleutelNamenLijst extends GeheimeCode {

    /**
     * Bijgevoegd is verzetsleden.txt
     * Maak een programma dat verzetsleden.txt uitleest.
     * Versleutel de namen op dezelfde manier als in GeheimeCode.java
     * En sla de versleutelde namen op in secret.txt
     *
     */
    public static void main(String[] args) {
        String filePath = "src/nl/novi/opdrachten/lijsten/";
        String file2Encrypt = filePath + "verzetsleden.txt";
        String outputFile = filePath + "secret.txt";
        List<String> names2Encrypt = new ArrayList<>();

        names2Encrypt = readFile(file2Encrypt);

        //Process content of array

        names2Encrypt = processList(names2Encrypt, "encode");

        //write content of array to secret.txt

        writeFile(names2Encrypt, outputFile);

    }

    private static List<String> readFile(String fileName) {
        List<String> textFromFile = new ArrayList<>();

        try {
            File file2Process = new File(fileName);
            Scanner fileContents = new Scanner(file2Process);
            while (fileContents.hasNextLine()) {
                    textFromFile.add(fileContents.nextLine());
            }
            fileContents.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return textFromFile;
    }

    private static void writeFile(List<String> encodedText, String fileName) {
        try {
            FileWriter write2File = new FileWriter(fileName);
            for (String encodedLine : encodedText) {
                write2File.write(encodedLine);
                write2File.write("\n");
            }
            write2File.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return;
    }
}
