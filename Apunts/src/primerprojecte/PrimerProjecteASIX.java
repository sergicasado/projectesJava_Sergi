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
public class PrimerProjecteASIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Declaració de variables 
            Ara vorem els primers exemples de variables
            Començarem per una variable entera
         */
        
        //Variable entera per guardar els dies d'un any
        int diaAny=266;
        int mes=10;
        int a=3, b=8, c=6, d=0;
        int nova;
        double milisegons=8.0e6;
        double m;
        char lletra=0x0110;
        boolean esDijous=true; //false
        String missatge="Estem al dia de l'any número ";
        byte diaSetmana=20;
        long numeroGran=3456456456L;
        
        //Anem a assignar valor 1 a totes les variables enteres
        //Manera llarga
        diaAny=1;
        mes=1;
        a=1;
        b=1;
        c=1;
        d=1;
        //Manera curta
        diaAny=mes=a=b=c=d=1;
        nova=7;
        
        
        //Proves en les variables
        /*System.out.println(diaAny);
        System.out.println(milisegons);
        System.out.println((char)(lletra+9));
        System.out.print(esDijous);
        System.out.println(missatge + (diaSetmana + diaAny));
        System.out.println(missatge + diaSetmana + diaAny);
        System.out.println(String.valueOf(diaSetmana) + diaAny);
        */
        
        //Anem a fer operacions en les variables i constants
        //Suma. a val 1  (la resta seria igual -)
        a = a+1;    //a val 2
        System.out.println(a);
        b = a+1;    //a val 2, b val 3
        System.out.println(a);
        System.out.println(b);
        c++;    //c=c+1;  c valdrà 2
        System.out.println(c);
        ++c;    //c=c+1;  c valdrà 3
        System.out.println(c);
        c=1;    //c val 1
        System.out.println(c++);    //Diu que c val 1
        System.out.println(c);      //Diu que c val 2
        c=1;    //c val 1
        System.out.println(++c);    //Diu que c val 2
        System.out.println(c);      //Diu que c val 2
        
        /*
        Notació postfixa:
        
        System.out.println(c++);    
        és equivalent a:
        
        System.out.println(c);
        c=c+1;
        
        Notació prefixa:
        
        System.out.println(++c);    
        és equivalent a:
        
        c=c+1;
        System.out.println(c);
        
        */
        
        //Altres formes d'evitar escriure...
        d = d+25;
        //equival a d+=25;
        
        d = d-100; //d-=100;
        
        d = d*5; //d*=5;
        
        //Divisió entera
        a=11/4;
        System.out.println(a);
        m=11/4;
        System.out.println(m);
        
        c=11%4;     //Resto o residu de la divisió entera
        System.out.println(c);
        m=11%4;
        System.out.println(m);
        
        
        //Divisió real
        m=11.0/4;
        System.out.println(m);
        
        m=11.0%4.8;
        System.out.println(m);
        
        /*
        m=(a+0.0)/b;    //canviem tipo sumant 0.0
        System.out.println(m);
        m=a*1.0/b;      //canviem tipo multiplicant 1.0
        System.out.println(m);
        m=(double)a/b;  //canviem tipo en un CASTING
        System.out.println(m);
        */
        
        a= a+b*(c/d)%a;
    }

}
