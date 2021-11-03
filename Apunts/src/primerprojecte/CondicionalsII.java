/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

/**
 *
 * @author profe
 */
public class CondicionalsII {
    
    public static void main(String[] args) {
        int a=8;
        
        //modifiquem el valor de a
        //Primer exemple --> tractem tots els casos de mode diferent i posem default
        switch(a){
            case 0:             //if(a==0){
                System.out.println("La variable val 0");
                //més instruccions...
                break;          //} else {
            case 5:             //if(a==5){
                System.out.println("La variable val 5");
                a++;
                //més instruccions....
                break;          //}
            default:            //else{
                System.out.println("La variable no val 0 ni 5");
                                //}
        }
        
        //Segon exemple --> tractem tots els casos de mode igual i posem default
        switch(a){
            case 0: 
            case 1:
            case 3:
            case 5:             //if(a==5){
                System.out.println("La variable val "+a);
                //més instruccions....
                break;          //}
            case 10:
                System.out.println("La variable val 10");
                break;
            default:            //else{
                System.out.println("La variable no val 0 ni 5");
                                //}
        }
        
        char c='A';
        
        //Tercer exemple --> tractem caràcters
        switch (c) {
            case 'A':
                
                break;
            case 'B':
                
            default:
                throw new AssertionError();
        }
        
        //Quart exemple --> tractem tots els casos de mode diferent i no posem default
        switch(a){
            case 0:             //if(a==0){
                System.out.println("La variable val 0");
                //més instruccions...
                break;          //} else {
            case 5:             //if(a==5){
                System.out.println("La variable val 5");
                a++;
                //més instruccions....
                break;          //} --> el break de l'últim cas no és obligatori 
            
        }
        
    }
    
}
