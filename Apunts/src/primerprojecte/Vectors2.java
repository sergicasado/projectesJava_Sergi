/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Vectors2 {
    
    public static void main(String[] args) {
        String[] diesSetmana={"Dilluns",
        "Dimarts", 
        "Dimecres", 
        "Dijous", 
        "Divendres", 
        "Dissabte", 
        "Diumenge"};
        int dia;
        Scanner ent=new Scanner(System.in);
        
        do {
            System.out.println("Introduix un dia de la setmana (1-7):");
            dia=ent.nextInt();
            if(dia<1 || dia>7) System.out.println("Ha de ser entre 1 i 7!!");
            else break;
        } while (true);
        
        System.out.format("%nHas triat el %s%n", diesSetmana[dia-1]);
        
    }
    
}
