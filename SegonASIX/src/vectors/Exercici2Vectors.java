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
public class Exercici2Vectors {

    public static void main(String[] args) {

        //Declaracio variables;
        Scanner ent = new Scanner(System.in);

        int dia, mes, any;
        boolean bixest;
        int[] mesos=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
        
        //Si es bixest i han triat el febrer, actualitzem els dies a 29
        
        if(bixest && mes==2) mesos[1]=29;

        //Mirem si la data es correcta.
        if (dia < 29) {
            System.out.println("CORRECTA");
        } else { //Aqui val 29,30,31
            if (dia <= mesos[mes-1])   System.out.println("CORRECTA");
          
                    
                    else System.out.println("INCORRECTA");
                }
                System.out.println("Has introduït la data " +dia+ "/" +mes+ "/" +any+"");    
            }
            
 
        }

            
    

