/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2Santi {

    public static void main(String[] args) {

        //Declaracio variables;
        Scanner ent = new Scanner(System.in);

        int dia, mes, any;
        boolean bixest;

        //Demanar dia
        do {

            System.out.println("Introdueix un dia del mes (1-31)");

            dia = ent.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Ha de ser un numero enter entre 1-31");
            } else {
                break;
            }
        } while (true);

        //Demanar mes
        do {

            System.out.println("Introdueix un mes de l'any (1-12)");

            mes = ent.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Ha de ser un numero enter 1-12");
            } else {
                break;
            }
        } while (true);

        //Demanar any i mirar si es bixest
        System.out.println("Introdueix un any");

        any = ent.nextInt();
        bixest = (any % 4 == 0 && any % 100 != 0);

        //Mirem si la data es correcta.
        if (dia < 29) {
            System.out.println("CORRECTA");
        } else { //Aqui val 29,30,31
            if (dia == 29 && (mes != 2 || bixest))   System.out.println("CORRECTA");
            else{
                
                if(dia==30 && mes!=2) System.out.println("CORRECTA");
                
                else{ //segur qur dia =0 31
                    if(mes!=2 && mes!=4 && mes!=6 && mes!=9 && mes!=11) System.out.println("CORRECTA");
                    
                    else System.out.println("INCORRECTA");
                }
                
            }
            

        }

    }
}
