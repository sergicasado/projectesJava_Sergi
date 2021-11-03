/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static metodes.Cadena.insertaCadena;

/**
 *
 * @author profe
 */
public class Exercici4 {
    
    public static void main(String[] args) {
        
        System.out.println(insertaCadena("Murlago","cié",3));
    }
    
    
//    //El mètode retornarà un String resultat d'insertar el segon String en el primer 
//    //a la posició especificada pel número (recordeu que comencen per 0)
//    public static String insertaCadena(String primer, String segon, int posicio){
//        //Tractament de casos especials
//        //si els 2 Strings són null el mètode retornarà null,
//        //si només un d'ells és null retornarà l'String no null,
//        //si el número és negatiu se farà el mateix que si valguès 0,
//        //si el número és superior a la llargada del primer String, se farà el 
//        //mateix que si valgués la llargada.   
//        if(primer==null && segon==null) return null;
//        if(primer==null && segon!=null) return segon;
//        if(primer!=null && segon==null) return primer;
//        if(posicio<0) posicio=0;
//        if(posicio>primer.length()) posicio=primer.length();
//        
//        //Declaracio de variables
//        String resultat="";
//        
//        //Extreure el troç inicial de primer des de el primer caràcter fins 
//        //l'anterior a posicio
//        for (int i = 0; i < posicio; i++) {
//            resultat+=primer.charAt(i);
//        }
//        //Versió curta
//        //resultat=primer.substring(0, posicio);
//        
//        //Ara concatenem tot el segon String al resultat
//        resultat+=segon;
//        
//        //Ara només falta concatenar el troç final del primer String al resultat
//        for (int i = posicio; i < primer.length(); i++) {
//            resultat+=primer.charAt(i);
//        }
//        //Versió curta
//        //resultat=primer.substring(posicio);
//
//        //Finalment retornem la cadena que conté el resultat desitjat
//        return resultat;
//    }
//    
    
}
