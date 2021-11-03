/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class exercici14resolt {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int dia, mes, any;

        System.out.println("Introdueix un dia");
        dia = ent.nextInt();

        System.out.println("Introdueix una mes");
        mes = ent.nextInt();

        System.out.println("Introdueix un any");
        any = ent.nextInt();
        
        System.out.println("Has introduit la data " + dia + "-" + mes + "-" + any);

        if (mes >= 1 && mes < 012) {

            //comprovarem el dia
            if (dia >= 1 && dia <= 28) {
                System.out.println("Data correcta");
            } else {
                if (dia < 1 || dia > 31) {
                    System.out.println("Data incorrecta");
                } else {
                    switch (dia) {
                        case 29:
                            if (mes != 2 || (any>=1582 && (any%400== 0 || ( any%4==0 && any%100!=0)))) 
                                System.out.println("Data correcta");
                            else  System.out.println("Data incorrecta");
                                break;
                                
                        case 30:
                            if (mes!=2)
                                System.out.println("Data correcta");
                            else System.out.println("Data incorrecta");
                            
                        case 31: 
                            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
                                System.out.println("Data correcta");
                            else System.out.println("Data incorrecta");
                             

                            break;
                        default:

                    }
// el dia està entre 29 i 31

                }

            }
        } else {
            System.out.println("Data incorrecta");
        }

    }
}
