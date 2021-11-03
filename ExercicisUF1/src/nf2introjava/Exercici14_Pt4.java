/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici14_Pt4 {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        
        int dia, mes, any;  //Variables per guardar la data
        
        System.out.println("Has d'introduir una data i jo et diré si és correcta.");
        System.out.println("\nIntroduix un dia:");
        dia=ent.nextInt();
        System.out.println("\nIntroduix un mes:");
        mes=ent.nextInt();
        System.out.println("\nIntroduix un any:");
        any=ent.nextInt();
        
        //Anem a comprovar la data
        //Comencem pel mes
        if(mes>=1 && mes<=12){
            //Comprovarem el dia
            if(dia>=1 && dia<=28)   System.out.println("Data correcta!!");
            else{   
                if(dia<1 || dia>31) System.out.println("Data incorrecta!!");
                else{   //El dia està entre 29 i 31
                    switch (dia) {
                        case 29:
                            if(mes!=2 || (any>=1582 && (any%400==0 || (any%4==0 && any%100!=0))))
                                System.out.println("Data correcta!!");
                            else System.out.println("Data incorrecta!!");                            
                            break;
                        case 30:
                            if(mes!=2)
                                System.out.println("Data correcta!!");
                            else System.out.println("Data incorrecta!!");                            
                            break;
                        case 31:
                            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
                                System.out.println("Data correcta!!");
                            else System.out.println("Data incorrecta!!");                            
                            break;
                            
                    }
                    
                }
            }
        }else System.out.println("Data incorrecta!!");
    }
    
}
