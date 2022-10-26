package operationOnFile;

import java.io.*;
import java.util.Scanner;

public class OperationOnFile {
    public static void main(String[] args) {
        BufferedReader bR = null;
        try {
            boolean correctDirectory = false;
            String directory = null;

            while(!correctDirectory) {
                System.out.println("Enter the path");
                directory = getString();
                if(!directory.endsWith(".txt")) {
                    System.out.println("Wrong format of file");
                } else {
                    correctDirectory = true;
                }
            }
            File myFile = new File(directory);
            bR = new BufferedReader(new FileReader(myFile));
            StringBuffer textBuffer = new StringBuffer();

            String line;
            while ((line = bR.readLine()) != null) {
                textBuffer.append(line);
                textBuffer.append("\n");
            }
            System.out.println("Content:");
            System.out.println(textBuffer);
        } catch (FileNotFoundException e) {
            System.out.println("Error: not found the file: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (!(bR == null)) {
                try {
                    bR.close();
                } catch (IOException e) {
                    System.out.println("Error: can't close the file: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        System.out.println("because I made exceptions and I caught them, my program sill is running");
    }
    public static String getString(){
        return new Scanner(System.in).next();
    }
}
