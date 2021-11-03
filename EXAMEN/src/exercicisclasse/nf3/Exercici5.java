/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici5 {
    
    public static void main(String[] args) {
        //Declaració de constants
        final int QUANTITAT=3;
        
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] valors;
        int suma=0;
        double mitjana;
        
        if(QUANTITAT<=0) System.out.println("Adéu!!");
        else{
            //Aquí sabem que QUANTITAT és positiva
            valors=new int[QUANTITAT];
            
            //Demanem valors a l'usuari
            System.out.format("Introduix %d valors enters:%n", QUANTITAT);
            for (int i = 0; i < valors.length; i++) {
                valors[i]=ent.nextInt();
                suma=suma+valors[i];
            }
            
            //Calculem la mitjana, una vegada hem llegit i sumat tots els valors
            mitjana=suma*1.0/QUANTITAT;
            
            //Mostrem els valors majors o iguals que la mitjana
            System.out.format("Els valors >= que %f són:%n", mitjana);
            for (int i = 0; i < valors.length; i++) {
                System.out.format("%s",((valors[i]>=mitjana)?(valors[i]+"\n"):""));

//                if(valors[i]>=mitjana) System.out.format("%s",(valors[i]+"\n"));
//                else System.out.format("%s","");
                
            }
        }
    }
    
}
