package vs1_3;


public class SolutionString {

    private static String add(int anzahl, int prim) {
        String str = anzahl + ". Primzahl: " + prim;
        return str;
    }

    public static void main(String[] args) {
        int anzahl = 4;
        int prim[] = {2, 3, 5, 7, 11};
        for (int i = 0; i <= anzahl; i++) {
            System.out.println(add(i + 1, prim[i]));
        }
    }
}