package withUnitTests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfCharactersInFile {
    public static void main(String[] args) {

        pobierzIPoliczZnaki_osiemZnakow_osiemZnakow();
        pobierzIPoliczZnaki_jedenZnak_jedenZnak();
        pobierzIPoliczZnaki_pustyPlik_zeroZnakow();


        System.out.println("Number of character is " + pobierzIPoliczZnaki(loadDirectoryToFile()));


    }
    public static int pobierzIPoliczZnaki(String directory) {
        File directoryOfFile = new File(directory);
        int numberOfCharacters = 0;
        try (FileReader reader = new FileReader(directoryOfFile)) {
            int sign;
            while ((sign = reader.read()) != -1) {
                System.out.print((char) sign);
                numberOfCharacters++;
            }
        }catch (FileNotFoundException e)  {
            System.out.println("File not found");
        }  catch (IOException e) {
            System.out.println("Error of read file: " + e.getMessage());
        }
        System.out.println();
        return numberOfCharacters;

    }
    private static String loadDirectoryToFile()  {
        String directory = "";
        for(boolean czyPrawidlowa = false; !czyPrawidlowa;) {
            System.out.println("Get directory of file");
            directory = getString();
            if (!directory.endsWith(".txt"))  {
                System.out.println("Wrong file extension");
            } else  {
                czyPrawidlowa = true;
            }
        }
        return directory;
    }
    //UNIT TESTS
    private static void pobierzIPoliczZnaki_jedenZnak_jedenZnak(){
        File directoryOfFile = new File("D:/PROGRAMOWANIE/testowePliki/testowyPlikJedenZnak.txt");
        int numberOfCharacters = 0;
        try(FileReader reader = new FileReader(directoryOfFile)){
            while (reader.read() != -1)  {
                numberOfCharacters++;
            }
        } catch (IOException e) {
            System.out.println("TEST: Error of read file " + e.getMessage());
        }
        assertEquals(1, numberOfCharacters);
    }
    private static void pobierzIPoliczZnaki_pustyPlik_zeroZnakow(){
        File directoryOfFile = new File("D:/PROGRAMOWANIE/testowePliki/testowyPlikZeroZnakow.txt");
        int numberOfCharacters = 0;
        try(FileReader reader = new FileReader(directoryOfFile)){
            while (reader.read() != -1)  {
                numberOfCharacters++;
            }
        } catch (IOException e) {
            System.out.println("TEST: Error of read file " + e.getMessage());
        }
        assertEquals(0, numberOfCharacters);
    }
    private static void pobierzIPoliczZnaki_osiemZnakow_osiemZnakow(){
        File directoryOfFile = new File("D:/PROGRAMOWANIE/testowePliki/testowyPlikOsiemZnakow.txt");
        int numberOfCharacters = 0;
        try(FileReader reader = new FileReader(directoryOfFile)){
            while (reader.read() != -1)  {
                numberOfCharacters++;
            }
        } catch (IOException e) {
            System.out.println("TEST: Error of read file " + e.getMessage());
        }
        assertEquals(8, numberOfCharacters);
    }
    private static void assertEquals(int expected, int actual)  {
        if (!(expected == actual))  {
            System.out.println("TEST: Error od method. Should be " + expected + " signs but has " + actual);
        }

    }
    private static String getString(){
        return new Scanner(System.in).next();
    }
}
