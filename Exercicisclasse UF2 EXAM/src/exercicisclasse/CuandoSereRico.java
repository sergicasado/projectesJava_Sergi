/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class CuandoSereRico {
    
    //Declaració de vars
    static Scanner ent = new Scanner(System.in);
    static int ncasos;
    
    
    public static void main(String[] args) {
//        SEGUIREM UN ESQUEMA DE RECORREGUT D'UNA SEQÜÈNCIA, DIFERENCIANT 1r ELEMENT        
//        inicialitzarVariables();
//        tractarPrimerElement();
//        mentre no elementFinal() fer
//            tractarSeguentElement();
//        fimentre
//        tractamentFinal();

        
        inicialitzarVariables();
        tractarPrimerElement();
        while(!elementFinal()){
            tractarElement();            
        }
        tractamentFinal();
    }

    private static void inicialitzarVariables() {
        //System.out.println("Quantes quantitats vols introduir?:");
        ncasos=ent.nextInt();
    }

    private static void tractarPrimerElement() {
        //Primer que res comprovem si tenim a casos a tractar
        if(ncasos<=0) ncasos=0;
        else tractarElement();
    }

    private static boolean elementFinal() {
        return ncasos==0;
    }

    

    private static void tractamentFinal() {
    }

    private static void tractarElement() {
        //Declaració de variables locals
        int quantitat;
        //System.out.println("Introduix quants diners vols acumular:");
        quantitat=ent.nextInt();
        int dinersAcumulats=0;
        int dia=0;
        
        while(dinersAcumulats<quantitat){
            dia++;
            dinersAcumulats+=paga(dia);
        }
        
        System.out.println(dia);
        
        //Decremento el número de casos per evita el bucle infinit
        ncasos--;
    }
    
    public static int paga(int dia){
        if(dia==1 || dia==2) return 1;
        return 2*paga(dia-2)+paga(dia-1);
        
    }
    
}
