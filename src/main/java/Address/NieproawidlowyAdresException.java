package Address;

public class NieproawidlowyAdresException extends Exception{
    private String message;
    public NieproawidlowyAdresException(String message)  {
        super(message);
    }
}
