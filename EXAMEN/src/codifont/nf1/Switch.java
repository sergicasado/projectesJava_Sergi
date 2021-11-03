/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Switch {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int num = 3;

        //Demanem dades a l'usuari
        //......
        //Mostrem el número introduït en lletres
//        if (num == 0) {
//            System.out.println("Has introduit el zero");
//        } else {
//            if (num == 1) {
//                System.out.println("Has introduit l'ú");
//            } else {
//                if (num == 2) {
//                    System.out.println("Has introduix el dos");
//                } else {
//                    if (num == 3) {
//                        System.out.println("Has introduit el tres");
//                    } else {
//                        if (num == 4) {
//                            System.out.println("Has introduit el quatre");
//                        } else {
//                            if (num == 5) {
//                                System.out.println("Has introduit el cinc");
//                            } else {
//                                System.out.println("No has introduit cap número de l'ú al cinc");
//                            }
//                        }
//                    }
//                }
//            }
//        }
        
        num=ent.nextInt();
        //anem a fer el mateix utilizant la instrucció switch
        switch(num){
            case 0:
               System.out.println("Has introduit el zero");
               break;
            case 1:
               System.out.println("Has introduit l'ú");
               break;
            case 2:
               System.out.println("Has introduit el dos");
               break;
            case 3:
               System.out.println("Has introduit el tres");
               break;
            case 4:
               System.out.println("Has introduit el quatre");
               break;
            case 5:
               System.out.println("Has introduit el cinc");
               break;
            default: 
               System.out.println("No has introduit cap número de l'ú al cinc");
        }
        
        //Ara mirem si els números són parells o imparells (només tractem del 0 al 5)
//        if(num==0 || num==2 || num==4){
//            System.out.println("És parell.");
//        }else{
//            if(num==1 || num==3 || num==5){
//                System.out.println("És imparell.");
//            }
//        }
        
        //El mateix usant el switch
        switch (num) {
            case 0:
            case 2:
            case 4:
                System.out.println("És parell");
                break;
            case 1:
            case 3:
            case 5:
                System.out.println("És imparell");
                
        }
        
    }

}
