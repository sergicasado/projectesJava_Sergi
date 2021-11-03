/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author alumne
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Declaració de variables
            Ara veurem els primers exemples de variables
            Començarem per una variable entera
         */
        
       
        //Variable entera per guardar els dies d'un any
        
        //Tipus primitius (aquests 4)
        int num=8;
        int diaAny=266;
        int mes=10;
        int a=3, b=8, c=6, d=0;
        double m;
        char lletra=0x0110;
        boolean esDijous=true; //false
        String missatge="Estem al dia de l'any número ";
        byte diaSetmana=20;
        long numeroGran=3000000000L;
        
        //Anem a asignar valor 1 a totes les variables enteres
        //Manera llarga 
        diaAny=1;
        mes=1;
        a=1;
        b=1;
        c=1;
        d=1;
        //Manera curta
        diaAny=mes=a=b=c=d=1;
        
        
        // Proves en les variables             
        System.out.println(diaAny);
        System.out.println(lletra);
        System.out.println(esDijous);
        System.out.println(numeroGran); 
        System.out.println(missatge + diaAny);
        System.out.println(diaAny + 1);
        
        //Anem a ser operacions en les variables i constants
        //Suma
        
        a=a+1;  //a val 2
       
        b = a+1; //b val 3
        System.out.println(a);
        System.out.println(b);
        c++; //c=c+1 c valdrà 2  -  notació postfixa
        System.out.println(c);
         //c=c+1 c valdrà 3  - notació prefixa    c++ dins d'una altra funció, mostra el valor de c i despres ho suma sense veure el resultat, ++c suma el valor i ho mostra sumat ja.
                
        d = d+25;  //es igual que 
        d+=25;     //aixo
        
        
        //divisió entera
        
        a=11/4; //a val 2
        System.out.println(a);
        a=11%4; //a val 3  residu
        
        
        c=11%4;
        System.out.println(c);  //residu de la divisió entera
        
        m=11/4;
        System.out.println(m);
          
        
        //divisió real
        
        
        m=(a+0.0)/b;  //sumem 0.0 o multipliquem *1.0 per pasar-la a real
        System.out.println(m);
        
        
        m=(double)a/b;  //canviem tupus en un CASTING
        System.out.println(m);
        
        
        m=11.0%4.8;
        System.out.println(m);
       
                
    }

}
