package wsserver;

public class isPrime {
    /*
     * add Methode zum erzeugen der Ausgabe
     *
     * @param i Position der Primzahl
     * @param prim Primzahl
     * return  String
     */
    static boolean isIt(int ipNum)
    {
        boolean flag = true;
        if (ipNum == 2 ) return flag;
        // This loop is used to check if a given number is divisible by numbers other than 1 and itself
        for(int i=3;i<ipNum/2;i++)
        {
            // check if given number is divisible
            if(ipNum%i==0)
            {
                // the moment code flows comes in to this block, it means the give number is divisible by numbers other than 1 and itself
                flag = false;
                // as you need not continue the loop, you can break the loop here itself, once you found its not a prime number.
                break;
            }
        }
        return flag;
    }
    /**
     * Main zum aufrufen der Funktion
     */
}
