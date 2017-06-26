package wsserver;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class primeService {

    /**
     * @param target the number of prime Numbers
     */
    public String Primzahl(int target) {
        boolean abbruch;
        String str = "";
        int primeCount = 0;

        for (int i = 2; primeCount < target; i++) {
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
                    str = solutionString.add(++primeCount, i, str);
                }

            }
        }
        return str;
    }
}