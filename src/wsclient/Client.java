package wsclient;

/**
 * Created by Thomas on 25.06.2017.
 */
public class Client {

    public static void main(String[] args)
    {
        PrimeClientService service = new PrimeClientService();
        PrimeClient primeclient = service.getPrimeClientPort();
        String text = primeclient.hallo("Faggot");
        System.out.println(text);
    }
}
