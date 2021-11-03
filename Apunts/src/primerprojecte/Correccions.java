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
public class Correccions {

    public static void main(String[] args) {
        int dia = 8, mes = 4, any=2000;
        boolean condicio=true;
        if (!(dia <= 31)) {
            if (dia <= 30) {

                if (mes == 1 || mes == 3 && dia <= 31);

            } else {
                if (dia <= 29) {

                    if (mes == 1 || mes == 3 && dia <= 31);

                } else {
                }
            }
        }
        
        if(!(any>=1582 && (any%400==0 || any%4==0 && any%100!=0))) System.out.println("Any no bixest.");
        
        if(condicio){
            System.out.println("1");
            System.out.println("2");
        }else{
            System.out.println("3");
            System.out.println("4");
        }

        if(!condicio){
            System.out.println("3");
            System.out.println("4");
        }else{
            System.out.println("1");
            System.out.println("2");
        }

        
    }

}
