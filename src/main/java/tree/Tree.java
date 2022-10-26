package Tree;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args)  {

        System.out.println("Podaj szerokosc podstawy choinki");
        int podstawa = getInt();
        int pietra = podstawa / 2;
        int i, h, j, l, g, t, p, y;
        int k = 3;
        int o = 2;

        if (podstawa % 2 != 0)  {
            for (i = 0; i <= (pietra - 1); i++)  {
                System.out.print(" ");
            }
            System.out.println("*");

            for (h = 1; h <= ((podstawa /2) - 1); h++, pietra--, k = k + 2)  {
                for (j = 1; j <= (pietra - 1); j++)  {
                    System.out.print(" ");
                }
                for (l = 1; l <= k ; l++)  {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (podstawa % 2 == 0)  {
            for (g = 1; g <= ((podstawa /2) - 1); g++, pietra--, o = o + 2)  {
                for (t = 1; t <= (pietra - 1); t++)  {
                    System.out.print(" ");
                }
                for (p =1; p <= o; p++)  {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        for (y = 1; y <= (podstawa); y++)  {
            System.out.print("*");
        }

    }

    public static int getInt()  {
        return new Scanner(System.in).nextInt();
    }

}