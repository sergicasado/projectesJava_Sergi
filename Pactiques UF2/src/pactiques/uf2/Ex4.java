/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactiques.uf2;

/**
 *
 * @author Sergi
 */
public class Ex4 {

    public static void main(String[] args) {
        System.out.println(insertaCadena(null, null, 0));
        System.out.println(insertaCadena(null, "subcadena", 0));
        System.out.println(insertaCadena("text", null, 0));
        System.out.println(insertaCadena("text", "subcadena", -1));
        System.out.println(insertaCadena("text", "subcadena", 0));
        System.out.println(insertaCadena("text", "subcadena", 2));
        System.out.println(insertaCadena("text", "subcadena", 4));
        System.out.println(insertaCadena("text", "subcadena", 10));

    }

    public static String insertaCadena(String cadena, String cadena2, int num) {

        if (cadena == null && cadena2 == null) {
            return null;
        }

        if (cadena == null && cadena2 != null) {
            return cadena2;
        }
        if (cadena2 == null && cadena != null) {
            return cadena;
        }
        if (num < 0) {
            num = 0;
        }
        if (cadena.length() < num) {
            num = cadena.length();
        }
   
        

         return cadena.substring(0,num) + cadena2 + cadena.substring(num,cadena.length());
    }

}
