/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 *
 * @author sergi
 */
public class Numero {
    
    /**
     * Retorna recursivament el màxim comú divisor dels 2 números passats com a 
     * paràmetre. Si algun d'ells és el 0 retorna 0.
     * @param a el primer número enter
     * @param b el segon número enter
     * @return El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    public static int mcdRecursiu(int a, int b){
        //Mirem si hi ha algun 0 i acabem en cas afirmatiu
        if(a==0 || b==0) return 0;
        
        //Mirem si hi ha algun número negatiu i el passem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        if(a==b) return a;
        if(a>b) return mcdRecursiu(a-b,b);
        return mcdRecursiu(a, b-a);
    }
    
    /**
     * Retorna iterativament el màxim comú divisor dels 2 números passats com a 
     * paràmetre. Si algun d'ells és el 0 retorna 0.
     * @param a el primer número enter
     * @param b el segon número enter
     * @return El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    public static int mcdIteratiu(int a, int b){
        //Mirem si hi ha algun 0 i acabem en cas afirmatiu
        if(a==0 || b==0) return 0;
        
        //Mirem si hi ha algun número negatiu i el passem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
        
    }
    
    /**
     * Calcula recursivament la suma dels números naturals des de num a 0.
     * Si el paràmetre és negatiu retorna -1.
     * @param num el valor a calcular
     * @return La suma dels números naturals des de num a 0.
     * @throws     StackOverflowError  si el paràmetre {@code num}
     *             és massa gran.
     */
    public static int sumaNaturals(int num){
        //Tractament del cas especial
        if(num<0) return -1;
        
        //Cas de parada
        if(num==0) return 0;
        
        //Cas iteratius
        return num+sumaNaturals(num-1);
    }

    /**
     * Calcula la suma dels números naturals des de num a 0.
     * Si el paràmetre és negatiu retorna -1.
     * Si retorna -2 significa que el valor del paràmetre és massa gran. 
     * @param num el valor a calcular
     * @return La suma dels números naturals des de num a 0.
     */
    public static int sumaNaturalsIteratiu(int num){
        //Tractament del cas especial
        if(num<0) return -1;
        int suma=0;
        
        while(num!=0){
            if(suma+num<suma) return -2;
            suma=suma+num;
            num=num-1;
        }
        return suma;
        
    }

    /**
     * 
     * @param base
     * @param exponent
     * @return Si l'exponent es 0 ens retorna 1. Si no ens retorna la fórmula 
     * 1.0/potenciaRec(base, exponent*-1)
     */
    
    public static double potenciaRec(double base, int exponent){
    
        //Cas de parada
        if(exponent==0) return 1.0;
        
        //Casos recursius
        if(exponent>0) return base * potenciaRec(base, exponent-1);
        return 1.0/potenciaRec(base, exponent*-1);
    }
    
    /**
     * Calcula de forma recursiva la potència d'un double base elevat a l'enter exponent:
     * @param x Es el numero base.
     * @param n Es l'enter que serà l'exponent.
     * @return Retorna la potencia del double elevat a l'enter indicat per nosaltres.
     */
    
    public static double potenciaE2Params(int x, int n){
    
        double resultat=1.0;
        
        for (int i = 1; i <= n; i++) {
            
            resultat+= potenciaRec(x, i)/factorial(i);
            
        }
    
        return resultat;
    
    }
    
    /**
     * Rep un enter com a paràmetre i calcula la potencia.
     * @param x Enter que li 
     * @return Retorna la potència d'℮ elevat al paràmetre especificat
     */
    
    public static double potenciaE(int x){
    
        return potenciaE2Params(x,11);
    
    }
    
    /**
     * Calcula el factorial d'un número.
     * @param num Es el numero enter que nosaltres triem.
     * @return Retorna el factorial del paràmetre indicat.
     */
    
    public static int factorial(int num){
        if(num<0) return -1;
        if(num==0) return 1;
        return num*factorial(num-1);
        
    }
    
    /**
     * El programa fa un buble que va buscant el factorial del paràmetre que nosaltres
     * li indiquem, ho farà mentres que en paràmetre sigui major a 1.
     * @param num Es el numero del que volem trobar el factorial, el triem nosaltres.
     * @return Si el paràmetre num es mejor a 0 retornem -1, en canvi si no ho es,
     * retornem com a resultat el seu factorial.
     */
    
    public static int factorialIteratiu(int num){
        if(num<0) return -1;
        
        int resultat=1;
        
        while(num>1){
        
            resultat*= num;
            num=num-1;
        }
            
        return resultat;
        
        
    }
    
    
    

}
