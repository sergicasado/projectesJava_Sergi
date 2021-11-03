/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author alumne
 */
public class ExerciciVectorsExemple {

    public static void main(String[] args) {

        int[] parells, imparells;    //Declaració vectors

        //Instancia
        parells = new int[51];
        imparells = new int[51];
        
//        Solució 1, tocant el mínim indispensable de l'exercisi 3
//        int indP = 0, indI = 0;
//
//        for (int i = -50; i <=50; i++) {
//            System.out.format("%d és %s%n", i, (i % 2 == 0 ? "parell" : "imparell"));
//
//            if (i % 2 == 0) {
//                parells[parells.length - 1 - indP] = i;
//                indP++;
//            } else {
//                imparells[imparells.length - 1 - indP] = i;
//                indI++;
//            }
//            
//        }
//        System.out.println("\nMostrem el vector dels parells");
//        for (int i = 0; i < imparells.length; i++){
//            System.out.println(imparells[i]);
//            
//        }
//        System.out.println("\nMostrem el vector dels imparells");
//        for (int i = 0; i < parells.length; i++){
//            System.out.println(parells[i]);
//        }



 //Solució 2, canviant la manera de treballar del índexos
        int indP = 0, indI = 0;
        indP=parells.length-1;
        indI=imparells.length-1;
   

        for (int i = -50; i <=50; i++) {
            

            if (i % 2 == 0) {
                parells[indP--] = i;
                
            } else {
                imparells[indI--] = i;
               
            }
            
        }
        System.out.println("\nMostrem el vector dels parells");
        for (int i = 0; i < imparells.length; i++){
            System.out.println(imparells[i]);
            
        }
        System.out.println("\nMostrem el vector dels imparells");
        for (int i = 0; i < parells.length; i++){
            System.out.println(parells[i]);
        }





    }

}
