import java.util.*;
import java.io.*;

public class Exceptions2 {
    public static void main(String[] args) {
        try{
            int total = 0;
            int num = 0;

            File myFile = null;
            Scanner inputFile = null;
            myFile = new File("inFile.txt");
            inputFile = new Scanner(myFile);

            while (inputFile.hasNext()) {
                num = inputFile.nextInt();
                total += num;
            }
            System.out.println("The total value is " + total);
        } catch(FileNotFoundException e) {
            System.err.println();
        }
    }
}