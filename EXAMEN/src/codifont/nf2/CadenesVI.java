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
public class CadenesVI {
    
    public static void main(String[] args) {
        
        int indexIni=-5, indexFi;
        String s="abcdefghij";
        
/*        System.out.println("abcdefghij".substring(5)); //extreu la cadena a 
        //partir del caracter situat a la posició 5 --> "fghij"
        if(indexIni>=0)
            System.out.println("abcdefghij".substring(indexIni)); //excepció!! 
        else System.out.println("Index incorrecte!!");

        
        indexIni=s.length();

        System.out.println("Index igual a longitud= "+s.substring(indexIni)); //excepció!! 
        indexIni=s.length()+1;
        if(indexIni<=s.length())
            System.out.println("Index igual a longitud+1= "+s.substring(indexIni)); //excepció!! 
        else System.out.println("Index incorrecte!!");
*/
        
        System.out.println(s.substring(4,9)); //extreu la cadena a
        //partir del caracter situat a la posició 4 fins 8 (9-1) --> "efghi"
        
        indexFi=s.length();
        System.out.println(s.substring(4,indexFi)); //extreu la cadena a
        System.out.println(s.substring(4)); //extreu la cadena a
     
        //Comparem el contingut dels objectes, no els objectes
        if(  s.substring(4,indexFi).equals(s.substring(4)) ) System.out.println("Són iguals");
        if(  s.substring(4).equals(s.substring(4, indexFi)) ) System.out.println("Són iguals");
        //Comparem objectes, no el contingut
        if(  s.substring(4)==s.substring(4, indexFi) ) System.out.println("Són iguals");
        else System.out.println("No són iguals!!");
        
        indexFi=s.length()+1;
        if(indexFi<=s.length()) System.out.println(s.substring(4,indexFi));
        else System.out.println("Index incorrecte!!");
        
        System.out.println(s.substring(4,4)); //retorna la cadena buida
        
        //System.out.println(s.substring(4,3)); //rebem excepció
        
        indexFi=4;
        indexIni=indexFi+1;
        
        if(indexIni<=indexFi) System.out.println(s.substring(indexIni, indexFi));
        else System.out.println("Indexos incorrectes!!");
        
        //Exemple de retornar els n últims caracters d'una cadena anomenada s
        int n=7;
        s="Vaig a extreure els "+n+" últims caràcters de mi mateixa";
        System.out.println(s.substring(s.length()-n));
        //Exemple de retornar els n últims caracters d'una cadena anomenada s 
        //però nomes x caràcters consecutius
        int x=4;
        System.out.println(s.substring(s.length()-n,s.length()-n+x));
        
         
    }
    
    
}
