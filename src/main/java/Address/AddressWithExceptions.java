package Address;

public class AddressWithExceptions {
    private String ulica;
    private String kodPocztowy;
    private String miasto;
    private int nrDomu;
    private AddressWithExceptions(String miasto, String kodPocztowy, String ulica, int nrDomu) throws NieproawidlowyAdresException {
        String znalezioneBledy = "";
        if (miasto == null)  {
            znalezioneBledy += "Miasto nie moze byc nullem. ";
        }
        if (kodPocztowy == null)  {
            znalezioneBledy += "Kod pocztowy nie moze byc nullem. ";
        }
        if (ulica == null)  {
            znalezioneBledy += "Ulica nie moze byc nullem. ";
        }
        if (nrDomu < 0)  {
            znalezioneBledy += "Numer domu musi byc wiekszy od zera. ";
        }
        if (!znalezioneBledy.equals("")){
            throw new NieproawidlowyAdresException(znalezioneBledy);
        }
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.ulica = ulica;
        this.nrDomu = nrDomu;

    }
    public String toString() {
        return miasto + " " + kodPocztowy + " ulica " + ulica + " " + nrDomu;
    }

    public static void main(String[] args) {
        try {
            AddressWithExceptions adres1 = new AddressWithExceptions("Miasteczko", "654", "Sezamkowa", 999);
            System.out.println("Obiekt typu Address.Adres utworzony.");
            System.out.println(adres1.toString());
        }catch (NieproawidlowyAdresException e)  {
            System.out.println(e.getMessage());
        }
        try {
            AddressWithExceptions adres2 = new AddressWithExceptions(null, null,"Sezamkowa", 999);
            System.out.println("Obiekt typu Address.Adres utworzony.");
            System.out.println(adres2.toString());
        }catch (NieproawidlowyAdresException e)  {
            System.out.println("Blad tworzenia adresu: " + e.getMessage());
        }
    }
}
