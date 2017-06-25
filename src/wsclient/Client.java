package wsclient;

/**
 * Created by Thomas on 25.06.2017.
 */
public class Client {

    public static void main(String[] args)
    {
        PrimeServiceService service = new PrimeServiceService();
        PrimeService primeService = service.getPrimeServicePort();
        System.out.println(primeService.primzahl());
    }
}
