package primerprojecte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profe
 */
public class MetodeFormat {
    
    public static void main(String[] args) {
        int i=97;              //Integer.MAX_VALUE;
        double d=3.4;
        char c='a'+'b';
        boolean b=true;
        String s="hola";
        
        System.out.format("b=%b  %B %n", b, b);
        System.out.format("b=%b  %1$B %n", b);
        System.out.format("%+015.5f  %n", d);

        
        //System.out.format("i=%x %n", i);
        //System.out.format("d=%g %n", d);
//        System.out.format("c=%d, %c %n", (int)c, c);
//        System.out.format("i=%d, %c %n", i, i);
        
//        for (char j = 'A'; j < 'a'; j++) {
//            System.out.format("%c ", j);
//            
//        }


    }
    
}
