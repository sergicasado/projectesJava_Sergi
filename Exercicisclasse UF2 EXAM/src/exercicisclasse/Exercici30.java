/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static metodes.Numero.sumaNaturals;
import static metodes.Numero.sumaNaturalsIteratiu;

/**
 *
 * @author profe
 */
public class Exercici30 {
    
    public static void main(String[] args) {
        
        System.out.println(sumaNaturals(5));
        System.out.println(sumaNaturals(-5));
        System.out.println(sumaNaturals(0));
        System.out.println(sumaNaturals(1000000005));

        System.out.println(sumaNaturalsIteratiu(5));
        System.out.println(sumaNaturalsIteratiu(-5));
        System.out.println(sumaNaturalsIteratiu(0));
        System.out.println(sumaNaturalsIteratiu(1000000005));


    }
    
}
