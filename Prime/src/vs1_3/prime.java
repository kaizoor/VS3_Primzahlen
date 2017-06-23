/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs1_3;

/**
 *
 * @author Bonacker.Robert
 */
public class prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean abbruch = false;
        
        for (int i = 2; i < 400000; i++) {
            if (i % 2 != 0) {                  //Wenn Zahl ungerade, weitermachen
                abbruch = false;
                for (int j = 3; j < i / 2; j += 2) //Zahl i mod alle Ã¼brigen Teiler (grÃ¶ÃŸer als i/2 reicht), i+=2, damit nur noch ungerade Zahlen ueberprueft werden
                {
                    if (i % j == 0) {          //Wenn i%j mindestens ein Mal == 0, ist Zahl i keine Primzahl
                        abbruch = true;
                        break;
                    }
                }
                if (!abbruch) {            //Kein Teiler gefunden, also ist Zahl i eine Primzahl
                    System.out.println(i);
                }
            }
        }
    }
}
