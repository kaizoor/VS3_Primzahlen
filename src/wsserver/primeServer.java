package wsserver;

import javax.xml.ws.Endpoint;

public class primeServer
{
    public static void main (String[] args)
    {
        String url = "http://localhost:1212/prim";
        Endpoint.publish(url, new primeClient());
        System.out.println("Service started @ " + url);
    }
}