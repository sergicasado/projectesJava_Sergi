/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Practica3TipoRima {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numEstrofes, estrofesQueRimen=0, numLletres, tipoRima;
        String vers1, vers2, vers3, vers4;
        
        //Demanar número estrofes
        do {            
            System.out.println("Introduix el número d'estrofes (>=0)");
            numEstrofes=ent.nextInt();
            if(numEstrofes<0) System.out.println("Ha de ser major o igual que 0!!");
            else break;
        } while (true);
        
        //Acabar si 0 estrofes
        if(numEstrofes==0) System.out.println("Adéu");
        //o
        else{
        //tractar les estrofes
            for (int i = 0; i < numEstrofes; i++) {
                //Demanar lletra rima
                do {            
                    System.out.println("Introduix el número de lletra per la rima (>=1)");
                    numLletres=ent.nextInt();
                    if(numLletres<1) System.out.println("Ha de ser major o igual que 1!!");
                    else break;
                } while (true);
                
                //demanar tipo de rima
                do {            
                    System.out.println("Introduix el tipo rima (1-4)");
                    tipoRima=ent.nextInt();
                    if(tipoRima<1 || tipoRima>4) System.out.println("Ha d'estar entre 1 i 4!!");
                    else break;
                } while (true);
                
                 
                //Llegir els versos
                System.out.println("Introduix els 4 versos de longitud mínima "+numLletres);
                for (int j = 0; j < 4; j++) {
                    String vers = ent.skip("[\r\n]*").nextLine();
                    
                }
                
                
                //Tractar els versos
            }            
            //Mostrar resultat final
            System.out.format("Un total de %d estrofes han seguit la rima indicada"
                    + "la qual cosa suposa un %5.1f%% d'estrofes introduïdes%n", estrofesQueRimen,
                    estrofesQueRimen/numEstrofes*100.0);
        }
        
    }
    
}
