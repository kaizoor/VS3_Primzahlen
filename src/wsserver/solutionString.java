package wsserver;

public class solutionString {
    /*
     * add Methode zum erzeugen der Ausgabe
     *
     * @param i Position der Primzahl
     * @param prim Primzahl
     * return  String
     */
    static String add(int i, int prim) {
        return i + ". Primzahl: " + prim;
    }

    /**
     * Main zum aufrufen der Funktion
     */
    public static void main(String[] args) {
        int anzahl = 4;
        int prim[] = {2, 3, 5, 7, 11};
        for (int i = 0; i <= anzahl; i++) {
            System.out.println(add(i + 1, prim[i]));
        }
    }
}
