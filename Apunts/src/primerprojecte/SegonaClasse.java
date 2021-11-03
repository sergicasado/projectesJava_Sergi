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
public class SegonaClasse {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        boolean a=true, b=false;
        int num=5;
        
        /*System.out.println(a);
        System.out.println(!a);
        
        System.out.println(a && b);
        System.out.println(a && !b);
        
        System.out.println(a || b);
        System.out.println(!(a || b));
        System.out.println(!a || b);
        
        System.out.println(   !a    && (b || !b) && a || b       );
        System.out.println(   !a    &&   true    && a || b       );
        System.out.println(   false &&   true    && a || b       );
        System.out.println(        false         && a || b       );
        System.out.println(                   false   || b       );
        System.out.println(        false       );*/
        
        a = 4==5;
        a = 4!=5;
        a = 4<5;
        a = 4<=5;
        a = 4>5;
        a = 4>=5;
        
        System.out.println(!(num==5) && (b || !b) && a || b       );
        

    }
    
}
