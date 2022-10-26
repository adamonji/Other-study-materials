package biblioteka;

public class Ksiazka {
    private final String tytul;
    private final String autor;
    private final int cena;

    public Ksiazka(String tytul, String autor, int cena)  {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }
    public String toString()  {
        return "biblioteka.Ksiazka " + tytul + " autora " + autor + " kosztuje " + cena;
    }
}
