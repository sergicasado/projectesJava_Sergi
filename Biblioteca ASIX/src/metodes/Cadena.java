/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Cadena {
    
    
    
    /**
     * Returns the char value at the specified index. An index ranges from 0 to length()
     * - 1. The first char value of the sequence is at index 0, the next at index 1,
     * and so on, as for array indexing.
     * If the char value specified by the index is a surrogate, the surrogate value is returned.
     * @param primer la cedena on buscarem...
     * @param segon la cadena que buscarem...
     * @param pos la posició a partir de la qual buscarem
     * @return the char value at the specified index
     */
    public static int buscaCadena(String primer, String segon, int pos){
        //Casos especials
        if(primer==null || segon==null || pos>=primer.length()) return -1;
        if(pos<0) pos=0;
        if(segon.length()==0) return pos<primer.length()?pos:primer.length();
        
        //Tractament de cas normal
        return primer.indexOf(segon, pos);
    }
    
    
    /**
     * El mètode retornarà un String resultat d'insertar el segon String en el primer 
     * a la posició especificada pel número (recordeu que comencen per 0)
     * @param primer Serà l'String principal, on a través de la posicio i el segon String serà canviat.
     * @param segon String que utilitzarem per posarlo dins la posicio indicada al primer String.
     * @param posicio Indiquem la posicio on insertar el primer String dins el segon.
     * @return Retorna un String resultat d'insertar el segon String en el primer 
     * a la posició especificada pel número
     */
  
    public static String insertaCadena(String primer, String segon, int posicio){
        /**
         * Tractament de casos especials
        si els 2 Strings són null el mètode retornarà null,
        si només un d'ells és null retornarà l'String no null,
        si el número és negatiu se farà el mateix que si valguès 0,
        si el número és superior a la llargada del primer String, se farà el 
        mateix que si valgués la llargada.*/   
        if(primer==null && segon==null) return null;
        if(primer==null && segon!=null) return segon;
        if(primer!=null && segon==null) return primer;
        if(posicio<0) posicio=0;
        if(posicio>primer.length()) posicio=primer.length();
        
        //Declaracio de variables
        String resultat="";
        
        //Extreure el troç inicial de primer des de el primer caràcter fins 
        //l'anterior a posicio
        for (int i = 0; i < posicio; i++) {
            resultat+=primer.charAt(i);
        }
        //Versió curta
        //resultat=primer.substring(0, posicio);
        
        //Ara concatenem tot el segon String al resultat
        resultat+=segon;
        
        //Ara només falta concatenar el troç final del primer String al resultat
        for (int i = posicio; i < primer.length(); i++) {
            resultat+=primer.charAt(i);
        }
        //Versió curta
        //resultat=primer.substring(posicio);

        //Finalment retornem la cadena que conté el resultat desitjat
        return resultat;
    }
    
    /**
     * Esun mètode vuit amb solament un return.
     * @return Ens retorna un String que no conté cap caracter dins seu.
     */
    
    public static String retornaCadenaBuida(){
        return "";
        
    }
    
    /**
     * Aquest mètode serveix per anar escrivint un text fins que li indiquem amb el paràmetre
     * final (un caracter que nosaltres triarem) quan volem parar, i llavors ens retornarà tot el text.
     * @param missatge Es el text que anem afegint cada cop si encara no hem indicat el final.
     * @param carFin Quan escribim aquest caracter s'acaba el programa i ens retorna tots els missatges
     * anteriorment escrits.
     * @return Retorna tots els missatges concatenats com a una sola String.
     */
    
    public static String llegirLinies(String missatge, char carFin){
        Scanner ent = new Scanner(System.in);
        String text="";
        
        //Demanem a l'usuari la introducció del text
        System.out.println(missatge);
        do {         
            String linia=ent.nextLine().trim();
            
            //Concatenem la línia al text
            text=text+linia;
            
            //Mirem si és o no la última línia del text
            if(linia.endsWith(carFin+"")) break;
            else text+='\n';    //Si no és la última afegixo un salt de línia
        } while (true);
        
        return text;
        
    }
    
    
    /**
     * 
     * @param cadena String completa que farem servir per despres buscar dins d'aquesta 
     * la subcadena que li indiquem.
     * @param subcadena Serà una petita part de la cadena, que buscarem dins d'aquesta
     * per indicarnos quants cops es repeteix dins del paràmetre cadena.
     * @return  retorna un vector d'enters que conté les posicions on apareix
     * la subcadena dins del text. Si no apareix retornem un vector de 0 caselles
     */
   
    public static int[] buscaCadenaMultiple(String cadena, String subcadena){
        int cont=0, index=0, 
                i;    //l'índex del vector
        int[] resultat=null;
        
        //Compto quantes aparicions hi ha per poder declarar la dimensió del vector
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            cont++;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        //Instancio el vector en el número de caselles indicat per la variable cont
        resultat=new int[cont];
        
        //Torno a inicialitzar les variables
        index=0;
        i=0;    //inicialitzo a 0 per què omplirem el vector d'esquerra a dreta 
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            resultat[i++]=index;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        return resultat;
        
    }
    

 //PT2 MOODLE
    
    /**
     * 
     * @param salts Indica a través de quantes cadenes hem de anar saltant per
     * desprès mostrar el resultat al return.
     * @param cadenes Cada una de les paraules que tindrem per comptar i concatenar.
     * @return Ens retorna totes les cadenes (strings) concatenades, ens indica quants
     * caràcters conté tota la cadena concatenada però sense comptar els espais que hi
     * puguin haver pel mig. Entre el número de caracters i les cadenes concatenades mostrem
     * l'String ':' per separar-ho. El mètode retornarà concatenades les cadenes començant
     * per la primera i saltant a les indicades pel número rebut com a paràmetre
     */
    public static String juntaSaltejats(int salts, String... cadenes) {

        if (salts < 1) {
            return "0";
        }

        if (salts >= 1 && cadenes.length == 0) {
            return "0";
        }

        int cont = 0;
        for (int i = 0; i < cadenes.length; i++) {
            cont++;

        }

        String novaCadena = cadenes[0];
        String novaCadenaCopia = "";

        for (int i = 0; i < cont - 1; i++) {
            if ((i + salts) >= cadenes.length) {
                break;
            }
            if ((i + salts) > cont) {
                break;
            } else {

                novaCadenaCopia = cadenes[i + salts];

                novaCadena = novaCadena + novaCadenaCopia;

                i = salts + (i);

                i--;

            }

        }

        String novaCadenaNoEspais = novaCadena.replaceAll(" ", "");

        int contaCaracters = 0;

        for (int i = 0; i < novaCadenaNoEspais.length(); i++) {

            contaCaracters++;

        }

        return contaCaracters + ":" + novaCadena;

    }

}
    
    



/*
public static int[] buscaCadenaMultiple(String text, String subcadena){
        int[] resultat;
        int cont=0, index=0, i=0;
        
        do{
            index=buscaCadena(text,subcadena,index);
            if(index==-1) break;
            cont++;
            //System.out.println(index);
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        resultat=new int[cont];
        index=0;
        do{
            index=buscaCadena(text,subcadena,index);
            if(index==-1) break;
            resultat[i++]=index;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        return resultat;
    
    
    }



*/