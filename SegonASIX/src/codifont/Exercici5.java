/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici5 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        int cont=0;
        double pes;
        int suma=0;
        
        do {            
            //Demanem usuari
            System.out.println("Introdueix un pes positiu de pizza (0 per acabar)");
            pes=ent.nextDouble();
            if(pes>0){ 
                cont++;
                suma+=pes;
            }
            else {
                if(pes==0) break;
                else{
                    System.out.println("Pes incorrecte!! Pizza no comptabilitzada!!");
                    continue;
                }
            }
           
          //Mostrar el pes en diferents formats
          //Ocupant 10 posicions, mostrant sempre el signe i en 2 decimals
        System.out.format("%+10.2f %n", pes);
          //el mateix omplint en 0s per l'esquerra
        System.out.format("%+010.2f %n", pes);
          //en notació científica, mostrant l'E majuscula
        System.out.format("%E %n", pes);
        System.out.format("%g %n", pes);
            
            
        } while (true);
        
        System.out.println("S'han introduit "+cont+" pizzes \ni la suma dels pesos és "+suma+ "Kg");

        
        
    }
    
}
