/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;

/**
 *
 * @Sergi Exercici38
 */
public class Exercici38 {

    public static void main(String[] args) {
        
        
    }
    
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2){
         boolean dataCorrecta;
        if(!dataCorrecta(dia1,mes1,any1) || !dataCorrecta(dia2,mes2,any2)) return -2;
        
        if(any1<any2) return -1;
        else if(any1>any2) return 1;
        
        if(mes1<mes2) return -1;
        else if(mes1>mes2) return 1;
        
        if(dia1<dia2) return -1;
        else if(dia1>dia2) return 1;
        
    }

}
