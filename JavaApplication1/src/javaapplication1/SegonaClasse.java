/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author alumne
 */
public class SegonaClasse {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        boolean a=true, b=false;
        
        /*System.out.println(a);
        System.out.println(!a);
        
        System.out.println(a && b);  //true + fals= false
        System.out.println(a && !b); //true + true= true
        
        System.out.println(a || b);  //tre O fals=true
        System.out.println(!a || b); //fals O fals=fals
        
        System.out.println(!a && (b || !b) && a || b);
        System.out.println(!a &&     true  && a || b);
        System.out.println( false && true  && a || b);
        System.out.println( false &&          a || b);
        System.out.println(        false        || b);
        System.out.println(        false        );  */
        
        a = 4==5; //4 es igual a 5? No. -> És fals
        a = 4!=5; //4 es diferent a 5? Si. -> És cert
        a = 4<5; //4 es menor que 5? Si. És cert.
        /*a = a<=5; //4 es igual o menor que 5? Si. -> És cert.*/
        a = 4>=5; //4 és mes gran o igual que 5? No. -> És fals
        a = 4>5; //4 es mes gran que 5? No. -> És fals.
        
    }
    
}
