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
        //check if n is a multiple of 2
        if (ipNum%2==0) flag = false;
        //if not, then just check the odds
        for(int i=3;i*i<=ipNum;i+=2) {
            if (ipNum % i == 0)
                flag = false;
        }
        return flag;
    }
    /**
     * Main zum aufrufen der Funktion
     */
}
