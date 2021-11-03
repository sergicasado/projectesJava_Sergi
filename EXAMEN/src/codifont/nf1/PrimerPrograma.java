
package codifont.nf1;

import java.util.Scanner;

public class PrimerPrograma {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        
        short diaMes=3; 
        byte diaSemana=7;
        int mes=9;
        long any=2020;
        
        float edatMitjana=25.7F;
        double notaMitjana=9;
        
        char inicial='A';
        
        boolean aprovat=true; //false
        
        boolean b=false;
        
        String cadena="Hello world!";
        
        int i;  //declaració de la variable i
        
        String c="45";
        
        c="5657";
        
        
        //Vaig a escriure la meua primera instrucció en Java
        mes++; //equivalent a mes=mes+1
        mes--; //equivalent a mes=mes-1
        ++mes;
        --mes;
        System.out.println( mes );
        
        String nom="Santi";
        String cognoms="Sabaté Sanz";
        byte edat=50;
        
        //System.out.println(cognoms + ", " + nom + ". Edat: " + edat + " anys.");
        /*System.out.println(cognoms + ", " + nom + ".");
        System.out.println("Edat: " + edat + " anys.");*/
        
        System.out.println(cognoms + ", " + nom + ".\n\nEdat: " + (edat+mes) + " anys.");
    
        System.out.println( edat + (mes + nom));
        System.out.println( "" + edat + mes + nom);
        
        //anem a provar altres operadors numèrics
        i=0;    //inicialitzem el valor de la variable i
        i+=45;  //equivalent a i=i+45;
        
        
     
        //System.out.println("Dis-me quants anys tens:");
        //edat=ent.nextByte();
        
        //Operadors booleans
        boolean cert=true; //false
        
        cert= mes==i;   //comparació igualtat
        cert= mes!=i;   //comparació desigualtat
        cert= mes<i;    //comparació menor
        cert= mes<=i;   //comparació menor o igual
        cert= mes>i;    //comparació major
        cert= mes>=i;   //comparació major o igual
        
        cert= ! (mes==i);   //mes!=i
        cert= (mes==i) && (mes!=9); //I lògic
        cert= (mes>2) || (i==25);   //O lògic
    }
    
}
