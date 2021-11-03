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
public class exercisi14 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int dia, mes, any;

        System.out.println("Introdueix un dia");
        dia = ent.nextInt();

        System.out.println("Introdueix un mes");
        mes = ent.nextInt();

        System.out.println("Introdueix un any");
        any = ent.nextInt();

        System.out.println("Has introduit la data " + dia + "-" + mes + "-" + any);

        //Si el mes es menor a 1 i major a 12
        if (mes < 1 || mes > 12) {

            System.out.println("Aquesta data no existeix");

            // si el dia es menor a 1 i major a 31
        } else if (dia < 1 || dia > 31) {

            System.out.println("Aquesta data no existeix");

            //els mesos 4,6,9,11 no tenen 31 dies 
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
            System.out.println("Aquesta data no existeix");
        }

        
            else if  (mes == 2 || any % 4 == 0 && any % 100 != 0 && dia > 29) {
               System.out.println("Aquesta data no existeix");

  

               
                    
                }
            }
        }

    

