package wsclient;

/**
 * Created by Thomas on 25.06.2017.
 */
public class primeClient {

    public static void main(String[] args)
    {
        PrimeServiceService service = new PrimeServiceService();
        PrimeService primeclient = service.getPrimeServicePort();
        primeclient.primzahl();
    }
}
