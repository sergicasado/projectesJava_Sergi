    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici8 {

    public static void main(String[] args) {
        
        //Declaració de variables
        
        Scanner ent=new Scanner(System.in);
        long num, copia, copiaPos;
        int longitud=0;
        boolean negatiu=false;
        int[] resultat;
        int index;
        
        
         //1 -> Demanar número al usuari.
        System.out.println("Introdueix un número enter qualsevol:");
        //1.5 -> Fer una copia del nº
        num=copia=ent.nextLong();
        
        //2 -> Mirar si es negatiu i ho apuntem en un boleà (si es negatiu canviem el signe a positiu multiplicant *-1)
        if (num < 0){
            negatiu=true;
            num=num*-1;
        }
        //if (negatiu=num<0) num=num*-1;
        
        //2.5 -> Fer una copia del nº
        copiaPos=num;
               
              
        //3 -> Calcular la longitud del número i instanciar el vector (fer el vector amb les caselles que toquin)
        while(num!=0){
            num=num/10;
            longitud++;
        } 
        
        resultat=new int[longitud];
        
        
        //4 -> Obtenir els digits del nº i guardar-los al vector.
        index=resultat.length-1;
        while(copiaPos!=0){
            
            resultat[index]=(int)copiaPos%10;
            copiaPos=copiaPos/10;
            index--;
        }
        
        //5 -> Mirar si es negatiu i si ho es canviar el signe de la primera posició del vector. (multiplicar *-1)
        if(negatiu) resultat[0]=resultat[0]*-1;
        
        
        //6 -> Mostrar el contingut del vector.
        System.out.format("Els dígits del número %d són:%n", copia);

        if(copia==0){
            resultat=new int[1];
        }
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
            
        }
        //Fer amb long i no amb int.
 }
    
}
