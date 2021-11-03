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
public class Cadenes1 {

    public static void main(String[] args) {

        //Declaracio de variables
        String nom = "Bon dia";
        String nom2 = "Bon dia " + ", com esteu?" + "Anem a estudiar els Strings...";

        //Declaro tota la longitud de Hola com a variable (es podria fer de algo que introdueix l'usuari);
        int longitud = "Hola".length();

        //Per consultar la longitud d'una cadena amb el metode .lenght;
        System.out.println(nom.length());
        System.out.println(longitud);
        System.out.println(nom2.length());

        //Podem accedir a una posicio de la cadena i veure quin caracter conté
        System.out.println("12345".charAt(0));
        System.out.println("12345".charAt(1));
        System.out.println("12345".charAt(2));
        System.out.println("12345".charAt(3));

        System.out.println("12345".charAt(4));

        //Anem a recorrer una cadena utilitzant el for d'esquerra a dreta
        for (int i = 0; i < "12345".length(); i++) {

            System.out.println("12345".charAt(i));

        }

        //Anem a recorrer una cadena utilitzant el for de dreta a esquerra
        for (int i = "12345".length() - 1; i >= 0; i--) {

            System.out.println("12345".charAt(i));

        }

        //Obtenir la cadena de dreta a esquerra saltant de 2 en 2
        String saltar = "";

        for (int i = 0; i < "12345".length(); i = i + 2) {

            saltar = saltar + "12345".charAt(i);
            System.out.println("12345".charAt(i));

        }
    }

}
