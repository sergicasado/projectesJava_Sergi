/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf2;

/**
 *
 * @author profe
 */
public class CadenesIV {
    
    public static void main(String[] args) {
        
        //Dóna negatiu per què "Abc" és més menuda que "Acd"
        System.out.println("Abc".compareTo("Acd"));
        
        //Dóna 0 per què les 2 cadenes són iguals
        System.out.println( "Abc".compareTo("Abc")      );
        
        //Dóna positiu per què "Acd" és més gran que "Abc"
        System.out.println("Acd".compareTo("Abc"));
        
        //Mirem si la primera cadena comença per la segona
        System.out.println("Bon dia".startsWith("Bon"));
        System.out.println("Bon dia".startsWith("Bon dia."));
        
        //Mirem si la primera finalitza en la segona
        System.out.println("Bon dia".endsWith("dia"));
        System.out.println("Bon dia".endsWith("dia."));
        
        //I si interessa no distingir majúscules de minúscules??
        "Bon dia".toUpperCase().startsWith("Bon".toUpperCase());
        "Bon dia".toLowerCase().endsWith("dia".toLowerCase());
        
        
        //Mirem si una cadena conté a una altra
        System.out.println("Abcd".contains("bc"));
        System.out.println("Abcd".contains("bd"));
        //Mirem si la primera cadena conté les 2 lletres
        System.out.println("Abcd".contains("b") && "Abcd".contains("d"));
        //Mirem si la primera cadena conté alguna de les 2 lletres
        System.out.println("Abcd".contains("b") || "Abcd".contains("d"));
        
        //Anem a passar a cadena a majúscules
        String s="abcd";
        s="abcd".toUpperCase();
        
        
        //Mirem el mètode trim() --> elimina caracters en blanc d'esquerra i dreta de la cadena
        s="       El meu nom és Pepito               ".trim();
        System.out.println(s.length());
        System.out.println(s);
        
        System.out.println("Abcd     ".endsWith("d"));
        System.out.println("Abcd     ".trim().endsWith("d"));
        
        //Mirem si la cadena és la buida, usant trim()
        s="                    ".trim();
        if(s.length()!=0) s.charAt(0);
        if(!s.isEmpty()) s.charAt(0);
        if(!s.isBlank()) s.charAt(0);
        
        //Mirem si la cadena és la buida, sense usar el trim()
        s="                    ";
        if(s.length()!=0) System.out.println("He entrat al primer if");;
        if(!s.isEmpty()) System.out.println("He entrat al segon if");;
        if(!s.isBlank()) System.out.println("He entrat al tercer if");;


    }
    
    
}
