/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactiques.uf2;

import java.util.Random;
import java.util.Scanner;
import static metodes.Cadena.*;

 public class Ex1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //declaramos variables...
        int num;
        //hacemos do while hasta que tengas el numero...
        do {
            System.out.println("Introduix un enter major que 0"); 
            num=ent.nextInt();
            // si el numero es negativo mostramos mensaje de error 
            if (num<1) {
                System.out.println("Ha de ser major que 0!!!");
            }else{
                //Si el numero es positivo acabamos
            break;
            }
        } while (true);
        
        
        // mostramos los caracteres generados
        System.out.println("Els caracters generats són:");
       //Hacemos el fori para recorrer num, es decir el numero de caracteres aleatorios que quiere el usuario
        for (int i = 0; i < num; i++) {
            System.out.format("%c", retornaCaracter());
            //con el format le indicamos que devolvemos un caracter i retornamos el metodo
        }
        System.out.println("");
    }

    //Metode que retorna aleatoriament un caacter entre ' ' i '}'
    static char retornaCaracter(){
    //Creamos el random....
    Random r=new Random();
    //casting
    
    char c = (char)(r.nextInt('z'-'a'+1)+'a'); 
                  
    return c;
    }

}