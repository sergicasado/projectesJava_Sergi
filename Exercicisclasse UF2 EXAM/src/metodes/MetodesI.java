/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class MetodesI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Scanner ent = new Scanner(System.in);
        String s;
        int i = 0;
//        i=r.nextInt(34);
//        System.out.println(i);
//        i=nextInt();
//        System.out.println(i);
//        i=elMeuMetodeAleatori(r.nextInt(34));
//        System.out.println(i);
//        System.out.println("Introduix cert o altre:");
//        if(esCert(ent.nextLine())) System.out.println("Has dit que és cert");
//        else System.out.println("No has dit que és cert");
        System.out.println("Introduix un any i té diré si és o no bixest:");
        if (!esBixest(ent.nextInt())) {
            System.out.print("No ");
        }
        System.out.println("és bixest");
    }

    void println(String cadena) {
        //Mostra la cadena per un dispositiu de sortidfa
    }

    //My very first method
    static void nomMetode123() {
        //Declaració de variables
        int i = 56;
        i++;
        i = nextInt();
    }

    static int nextInt() {

        return 0;
    }

    static int elMeuMetodeAleatori(int num) {
        Random r = new Random();
        return r.nextInt(num);
    }

    static int returns() {
        int i=7;
        i++;
        if (true) {
            int j = 23;
        } else {
            int k = 89;
        }
        i++;

        if (true) {
            return 2;
        }
        return 2;

    }

    //Mètode que diu si has escrit el text "cert", sense tenir en compte maj/min
    static boolean esCert(String afirmacio) {

        return afirmacio.equalsIgnoreCase("cert");
    }

    static boolean esBixest(int any) {

        return any > 1582 && (any % 400 == 0 || any % 4 == 0 && any % 100 != 0);
    }
}
