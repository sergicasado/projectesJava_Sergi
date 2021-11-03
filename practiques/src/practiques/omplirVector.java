/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques;

/**
 *
 * @author alumne
 */
public class omplirVector {

    public static void main(String[] args) {

//        Fer un programa en Java que mostre els números enters entre el -50 i el 50,
//        ambdós inclosos, utilitzant una instrucció for(). Per cada número ha de 
//        mostrar si és parell o imparell i guardar-lo a un vector de parells si és 
//        parell o d'imparells, en cas contrari. Exemple:
        int indexP = 0, indexI = 0;
        int[] total = new int[101];
        int[] parells = new int[51];
        int[] imparells = new int[51];
        int cont = 50;

        for (int i = 0; i <= total.length; i++) {

            if (cont % 2 == 0) {

                parells[indexP] = cont;
                indexP++;

            } else {

                imparells[indexI] = cont;
                indexI++;
            }
            cont--;

        }

        //Mostrar el vector
        System.out.println("Són parells:");
        for (int i = 0; i < parells.length; i++) {
            System.out.print(parells[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Són imparells:");
        for (int i = 0; i < imparells.length; i++) {
            System.out.print(imparells[i] + " ");
        }

    }

}
