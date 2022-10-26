package biblioteka;

//NIEMUTOWALNA KLASA Z NIEMUTOWALNYMI POLAMI
public class Biblioteka {
    private final Ksiazka[] ksiazkiNaStanie;
    //KONSTRUKTOR NIEMUTOWALNNEJ TABLICY
    public Biblioteka(Ksiazka[] ksiazkiNaStanie)  {
        this.ksiazkiNaStanie = new Ksiazka[ksiazkiNaStanie.length];
        for  (int i = 0; i < ksiazkiNaStanie.length; i++)  {
            this.ksiazkiNaStanie[i] = ksiazkiNaStanie[i];
        }
    }
    //GETER KOPI TABLICY
    public Ksiazka[] getKsiazkiNaStanie()  {
        Ksiazka[] kopia = new Ksiazka[ksiazkiNaStanie.length];
        for (int i = 0; i < ksiazkiNaStanie.length; i++)  {
            kopia[i] = ksiazkiNaStanie[i];
        }
        return kopia;
    }

    public static void main(String[] args) {
        Ksiazka lektura1 = new Ksiazka("Dupoczytadlo", "Dupek", 500);
        Ksiazka lektura2 = new Ksiazka("Do spania", "Spioch", 35);
        Ksiazka lektura3 = new Ksiazka("Czytandlo ktore upadlo", "Wiesniak", 3);
        Ksiazka[] lekturySzkolne = new Ksiazka[]{lektura1, lektura2, lektura3};
        Biblioteka naStanie = new Biblioteka(lekturySzkolne);

        for (Ksiazka ksiazka : naStanie.getKsiazkiNaStanie())  {
            System.out.println(ksiazka);
        }
    }
}
