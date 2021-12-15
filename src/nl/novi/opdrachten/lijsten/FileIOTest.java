package nl.novi.opdrachten.lijsten;
import java.io.File;  // Import the File class
import java.io.IOException;

public class FileIOTest {
    public static void main(String[] args) {
        String filePath = "src/nl/novi/opdrachten/lijsten/";
        File myObj = new File(filePath + "verzetsleden.txt");

        File f = new File(filePath + "file.txt");
        try {
            System.out.println(f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
