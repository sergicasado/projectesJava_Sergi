/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author alumne
 */
public class CadenesVI {

    public static void main(String[] args) {
        int IndexFi = 1;
        int IndexIni = -5;
        String s = "abcdefghij";
        //Els index no es conten, sempre es el següent

        //Extreu la cadena a partir del caracter situat a la posicio 5
        System.out.println("0123456789".substring(5));
        System.out.println("abcdefghij".substring(5));

        //Extreu la cadena a desde del caracter a la posicio 4 al caracter
        //al caracter a la posicio 9
        System.out.println("abcdefghij".substring(4, 9));

        if (IndexIni >= 0) {

            System.out.println("Index igual a longitud= " + s.substring(IndexIni)); //excepció!!
            IndexIni = s.length() + 1;
            if (IndexIni < s.length()) {
                System.out.println("Index igual a longitud+1= " + s.substring(IndexIni)); //excepció!!
            } else {
                System.out.println("Index incorrecte!!");
            }

            System.out.println(s.substring(4, 9)); //extreu la cadena a partir del caracter situat
            //a la posicio 4 fins la 8 (9-1)

            IndexFi = s.length();
            System.out.println(s.substring(4, IndexFi)); //extreu la cadena a
            System.out.println(s.substring(4)); //extreu la cadena a 

            //Comparem el contingut dels objectes, no els objectes
            if (s.substring(4, IndexFi).equals(s.substring(4))) {
                System.out.println("Son iguals");
            }

            if (s.substring(4).equals(s.substring(4, IndexFi))) {
                System.out.println("Son iguals");
            }

            //Comparem objectes, no el contingut
            if (s.substring(4) == s.substring(4, IndexFi)) {
                System.out.println("Son iguals");
            }

            IndexFi = s.length() + 25;
            System.out.println(s.substring(4, IndexFi)); //extreu la cadena a

        }

    }
}
