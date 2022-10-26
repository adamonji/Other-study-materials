package withUnitTests;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args)  {

        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 100, 200, 125 };

        SzukanieMetodaUjemnaWZbiorze0();
        SzukanieMetodaDodatniaWZbiorze4();
        SzukanieMetodaZeroWZbiorze2();
        SzukanieMetodaOstatniaWZbiorze13();
        SzukanieMetodaNieObcecnaWZbiorzeUjemna();
        SzukanieMetodaPierwszaWZbiorze0();

        System.out.println("Podaj liczbe w celu znalezienia jej indeksu");
        int liczba = getInt();
        if(SzukanieMetoda(tablicaLiczb, liczba) >= 0)  {
            System.out.println("Indeks podanej liczby = " + SzukanieMetoda(tablicaLiczb, liczba));
        } else  {
            System.out.println("Brak podanej liczby w zbiorze" + SzukanieMetoda(tablicaLiczb, liczba));
        }
    }
    public static int SzukanieMetoda(int[] tab, int x)  {
        for(int i = 0; i < tab.length; i++)  {
            if (tab[i] == x)  {
                return i;
            }
        }
        return (-1);
    }
    public static void assertEquals(int expected, int actual)  {
        if (!(expected == actual))  {
            System.out.println("BLAD! Oczekiwano " + expected + " a otrzymano" + actual);
        }
    }
    public static void SzukanieMetodaUjemnaWZbiorze0()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(1, (SzukanieMetoda(tablicaLiczb, -50)));
    }
    public static void SzukanieMetodaDodatniaWZbiorze4()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(4, (SzukanieMetoda(tablicaLiczb, 2)));
    }
    public static void SzukanieMetodaZeroWZbiorze2()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(2, (SzukanieMetoda(tablicaLiczb, 0)));
    }
    public static void SzukanieMetodaOstatniaWZbiorze13()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(13, (SzukanieMetoda(tablicaLiczb, 125)));
    }
    public static void SzukanieMetodaNieObcecnaWZbiorzeUjemna()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(-1, (SzukanieMetoda(tablicaLiczb, 9)));
    }
    public static void SzukanieMetodaPierwszaWZbiorze0()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 2, 3, 4, 5, 6, 7, 50, 100, 200, 125 };
        assertEquals(0, (SzukanieMetoda(tablicaLiczb, -20)));
    }
    public static void SzukanieMetodaPustyZbiorDodatniaUjemna()  {
        int[] tablicaLiczb = {};
        assertEquals(-1, (SzukanieMetoda(tablicaLiczb, 50)));
    }
    public static void SzukanieMetodaDodatniaKilkaWZbiorze4()  {
        int[] tablicaLiczb = { -20, -50, 0, 1, 100, 2, 3, 4, 5, 6, 7, 50, 100, 100, 200, 125 };
        assertEquals(4, (SzukanieMetoda(tablicaLiczb, 100)));
    }
    public static int getInt()  {
        return new Scanner(System.in).nextInt();
    }
}
	  