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
public class CadenesIV {
    
    public static void main(String[] args) {
        
        String cad="En un lugar de la Mancha";
        int index=cad.lastIndexOf("l");
        while(index!=-1){
            System.out.println(index);
            index=cad.lastIndexOf("l",index-1);
        }

        //anem a buscar aparicions de la lletra 'l' dins del text d'esquerra a dreta
//        int cont=0;
//        int index=cad.indexOf("l");
//        while(index!=-1){
//            System.out.println(index);
//            index=cad.indexOf("l",index+1);
//            cont++;
//        }
        //anem a buscar aparicions de la lletra 'l' dins del text de dreta a esquerra
        
//        System.out.println(cad.indexOf("l"));
//        
//        for (int i = 0; i < cad.length(); i++) {
//            if(cad.charAt(i)=='l') System.out.println(i);
//            
//        }
//
//        System.out.println(cad.lastIndexOf("l"));
        
        
    }
    
}
