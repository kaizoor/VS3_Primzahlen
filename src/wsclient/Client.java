package wsclient;

import java.util.Scanner;
/**
 * Created by Thomas on 25.06.2017.
 */
public class Client {

    public static void main(String[] args)
    {
        int n=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Primzahlen sollen ausgegeben werden?");

        do {
            System.out.println("Bitte eine positive Zahl eingeben!");
            while (!scanner.hasNextInt()) {
                System.out.println("Es wurde keine positive Zahl eingegeben");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        PrimeServiceService service = new PrimeServiceService();
        PrimeService primeService = service.getPrimeServicePort();
        System.out.println(primeService.primzahl(n));
    }
}
