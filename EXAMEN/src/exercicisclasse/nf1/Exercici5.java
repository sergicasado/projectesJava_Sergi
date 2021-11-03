/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici5 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int cont=0;
        double pes, suma=0.0, maxim=0.0, minim=0.0;
        String cadena="Bon dia";
        
        do {            
            //Li diem a l'usuari què ha de fer
            System.out.println("Introduix un pes positiu de pizza (0 per acabar):");
            pes=ent.nextDouble();
            if(pes>0.0){
                cont++;
                
                //És la primera pizza? cont==1
                if(cont==1) maxim=minim=pes; //Equival a fer maxim=pes;minim=pes;
                else{
                    if(maxim<pes) maxim=pes;
                    if(minim>pes) minim=pes;
                }
                suma+=pes;
            }
            else{
                if(pes==0.0) break;
                else{
                    System.out.println("Pes incorrecte!! Pizza no comptabilitzada!!");                    
                }
            }
            //Mostrem el pes en diferents formats
            //ocupant 10 posicions, mostrant sempre el signe, i en 2 decimals
            System.out.format("%+10.2f %n", pes);
            //el mateix omplint en 0s per l’esquerra
            System.out.format("%+010.2f %n", pes);
            //en notació científica, mostrant l’E majúscula
            System.out.format("%E %n", pes);
            //de la manera més curta entre decimal i científica, en minúscules 
            System.out.format("%g %n", pes);

        } while (true);
        
        //System.out.println(cadena+", s'han introduït "+cont+" pizzes \ni la suma dels pesos és "+suma);
        if(cont==0) System.out.println("No s'ha introduït cap pizza en pes vàlid!!");
        else{
            System.out.format("%s, s'han introduït %d pizzes %ni la suma dels pesos és %f %n", cadena, cont, suma);
            System.out.format(", la mitjana és %.3f, la més pesada pesa %f i la menys %f %n", suma/cont, maxim, minim);            
        }
    }
    
}
