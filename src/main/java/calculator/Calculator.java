package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)  {

        System.out.println("Kalkuluj. Masz do dyspozycji operacje takie jak [/ * + -]");
        double liczba1;
        double liczba2;
        String operacja;
        double wynik = 0;
        System.out.println("Podaj liczbe");
        liczba1 = getDouble();
        String decyzja;

        petla1: for(int i = 0;;i++)  {
            if (i != 0)  {
                System.out.println("Czy chcesz dalej liczyc? [T/N]");
                decyzja = getString();
                if (decyzja.equals("T") || decyzja.equals("t"))  {
                } else  {
                    System.out.println("= " + wynik);
                    break petla1;
                }
            }
            System.out.println("Podaj operacje [/ * + -]");
            operacja = getString();
            System.out.println("Podaj liczbe");
            liczba2 = getDouble();
            if (operacja.equals("/"))  {
                if (liczba2 == 0)  {
                    System.out.println("Nie dziel przez zero!");
                    System.out.println("Wpisz inna wartosc");
                    liczba2 = getDouble();
                    if (liczba2 == 0)  {
                        System.out.println("Ty kmiocie");
                        break petla1;
                    }
                }
                if (liczba2 > 0)  {
                    if (i == 0)  {
                        wynik = liczba1 / liczba2;
                        System.out.println("= " + wynik);
                    } else {
                        wynik = wynik / liczba2;
                        System.out.println("= " + wynik);
                    }
                }
            }

            if (operacja.equals("*"))  {
                if (i == 0)  {
                    wynik = liczba1 * liczba2;
                    System.out.println("= " + wynik);
                } else  {
                    wynik = wynik * liczba2;
                    System.out.println("= " + wynik);
                }
            }

            if (operacja.equals("+"))  {
                if (i == 0)  {
                    wynik = liczba1 + liczba2;
                    System.out.println("= " + wynik);
                } else  {
                    wynik = wynik + liczba2;
                    System.out.println("= " + wynik);
                }
            }

            if (operacja.equals("-"))  {
                if (i == 0)  {
                    wynik = liczba1 - liczba2;
                    System.out.println("= " + wynik);
                } else  {
                    wynik = wynik - liczba2;
                    System.out.println("= " + wynik);
                }
            }
            if (operacja.equals("/") || operacja.equals("*") || operacja.equals("+")  || operacja.equals("-"))  {
            }  else  {
                System.out.println("Nieprawidlowa operacja!");
                i--;
                continue petla1;
            }

        }
    }

    public static double getDouble()  {
        return new Scanner(System.in).nextDouble();
    }
    public static String getString()  {
        return new Scanner(System.in).next();
    }
}