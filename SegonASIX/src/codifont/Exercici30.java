/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Exercici30 {

    public static void main(String[] args) {

        int num;
        String c;
        
        String text = "";


        Scanner ent = new Scanner(System.in);
        num = ent.nextInt();
       

       
if (num == 0) {
            System.out.println("CADENA BUIDA");
        }else
        if (num < 0) {
            System.out.println("VALOR INCORRECTE");
        }else{
        for (int i = 0; i <= num; i++) {

           

            String llegeix = ent.nextLine();

            text = text + llegeix;

          

            

        }
            {
                System.out.println(text);
            }
        
        }

    }

}
