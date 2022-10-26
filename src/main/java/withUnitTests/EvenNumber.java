package withUnitTests;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args)  {

        czyParzystaMetoda_wartoscParzysta_true();
        czyParzystaMetoda_wartoscNieParzysta_false();
        czyParzystaMetoda_wartoscZero_false();
        czyParzystaMetoda_wartoscParzystaUjemna_true();
        czyParzystaMetoda_wartoscNieParzystaUjemna_false();


        System.out.println("Wpisz liczbe w celu sprawdzenia czy jest parzysta");

        int liczba = getInt();
        if (czyParzystaMetoda(liczba))  {
            System.out.println("Podana przez Ciebie liczba jest liczba parzysta");
        } else  {
            System.out.println("Podana przez Ciebie liczba nie jest liczba parzysta");
        }

    }

    public static int getInt()  {
        return new Scanner(System.in).nextInt();
    }
    public static boolean czyParzystaMetoda(int x)  {
        return x % 2 == 0;
    }
    //assertEquals
    public static void assertEquals(boolean expected, boolean actual)  {
        if (expected != actual)  {
            System.out.println("Blad metody poniewaz oczekiwalismy wartosci " + expected + " a otrzymalismy " + actual);
        }
    }
    public static void czyParzystaMetoda_wartoscParzysta_true()  {
        assertEquals(true, czyParzystaMetoda(4));
    }
    public static void czyParzystaMetoda_wartoscNieParzysta_false()  {
        assertEquals(false, czyParzystaMetoda(3));
    }
    public static void czyParzystaMetoda_wartoscZero_false()  {
        assertEquals(true, czyParzystaMetoda(0));
    }
    public static void czyParzystaMetoda_wartoscParzystaUjemna_true()  {
        assertEquals(true, czyParzystaMetoda(-6));
    }
    public static void czyParzystaMetoda_wartoscNieParzystaUjemna_false()  {
        assertEquals(false, czyParzystaMetoda(-7));
    }
}
  