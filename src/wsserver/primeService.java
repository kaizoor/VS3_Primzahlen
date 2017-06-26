package wsserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class primeService {

    public int[] Primzahl(int target) {

        String str="";
        int primeCount=0;
        int[] primes = new int[target];
        for(int i=2;target>primeCount;i++)
        {
            if(!new String(new char[i]).matches("(..+?)\\1+"))
            /*
            Das ? bringt das + dazu nicht "greedy" zu sein.
            * Das + matcht die vorangegangenen Token.
            * Der . matcht jedem beliebigen Character, der kein line break ist.
            * \1+versucht den match aus (..+?) zu wiederholen.
            * Der der gesamte Ausdruck (..+?)\\1+ versucht Vielfache von 2 zu matchen bis die Länge unserer
            * Zahl erreicht ist, oder es einen Erfolg gab.
            * Dann Vielfache von 3 usw...
            * Ein Abbruch bei sqrt(n) oder n/2 ist mit der regex nicht möglich, daher bel&auml;uft sich die Laufzeit ca. auf O(n^2)
            * Die Suche nach den ersten 4000 Primzahlen hat auf meinem Gerätt ca. 290 Sekunden in Anspruch genommen.
            */
            {
                primes[primeCount]=i;
                primeCount++;
            }
        }

        /*
        int num=2;
        while(primeCount!=target)// while primeCount!= number of desired prime numbers entered keep searching..
        {
            boolean prime=true;// to determine whether the number is prime or not
            for (int i=2;i*i<=num;i++)//efficiency matters
            {
                if (num%i==0)
                {
                    prime=false;// if number divides any other number its not a prime so set prime to false and break the loop.
                    break;
                }

        }
            if (prime)
            {
                primes[primeCount]=i;
                primeCount++;

            }
            num++; //see if next number is prime or not.
        }
         */


        return primes;
    }
}