/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 * 2. Fer un programa en Java que mostre els números enters entre el -5 i el 5, 
 * ambdós inclosos. Per cada número ha de dir si és parell o imparell. Exemple:
	
	-50 és parell
	-49 és imparell
	-48 és parell
	-47 és imparell
	...
	47 és imparell
	48 és parell
	49 és imparell
	50 és parell

 * @author profe
 */
public class Exercici2 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int ini, fi;
        
        //Demanem els valors a l'usuari, forçant-lo a que siguen correctes (ini<=fi)
        do {            
            System.out.println("Introduix els valors enters inicial i final:");
            ini=ent.nextInt();
            fi=ent.nextInt();
            if(ini>fi){
                //Este codi s'executarà si les dades són incorrectes
                System.out.println("Atenció, el valor inicial ha de ser menor o igual que el final!!");
                //continue;
            }else{
                //Este codi s'executarà si les dades són correctes
                break;
            }
            
        } while (true);
        
        //Ho farem usant la sentència for
        for (int i = ini; i <= fi; i++) {
            if(i % 2 == 0){
                System.out.println(i+" és parell.");
            }else{
                System.out.println(i+" és imparell.");
            }
            
        }
        
        
        
    }
    
}
