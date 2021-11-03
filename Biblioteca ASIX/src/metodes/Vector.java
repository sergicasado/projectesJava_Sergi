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
public class Vector {
    
    /**
     * Reb un número variable de paràmetres formals de tipo real (float). Si no se li passa cap paràmetre
     * retornarà null
     * @param valors  Diferents numeros que anem afegint nosaltres. (Si posem 1 serà 1.0)
     * @return retorna un vector contenint el valor dels paràmetres.
     */
    
    public static float[] ompleVectorFloats(float... valors){
        //Casos especials
        if(valors==null || valors.length==0) 
            return null; //Casos en que hem rebut null o no hem rebut paràmetre 
                         //o hem rebut un vector buit  

        //Versió llarga                 
//        float[] resultat=new float[valors.length];
//        for (int i = 0; i < resultat.length; i++) {
//            resultat[i]=valors[i];
//        }
                         
//        return resultat; 
        
        //Versió curta
        return valors;
    
    }
    
    
    /**
     * Reb com a paràmetre un vector d'enters i un número enter, i borra del
     * vector totes aquelles caselles que continguen números que no siguen múltiples
     * del número passat com a paràmetre, dixant a les primeres posicions del vector 
     * només aquells que sí ho siguen.
     * @param v Nom del vector que utilitzarem al mètode.
     * @param num Ens servirà per comprovar i comparar amb els numeros que hi han
     * dins del vector.    
     */
    
    
    
    public static void eliminaNoMultiples(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return;
        
        int i=0, iM=0;
    
        while(i<v.length){
            if(v[i]%num==0){
                v[iM]=v[i];
                if(i!=iM) v[i]=-1;
                iM++;
            }else v[i]=-1;
            i++;
        }
    
    }
    
    /**
     * Reb els mateixos paràmetres que l'anterior, però enlloc de modificar el 
     * vector que rep al primer paràmetre en retorna un en el resultat desitjat,
     * dixant intacte el vector paràmetre.
     * @param v Nom del vector que farem servir al mètode.
     * @param num Ens servirà per comprovar i comparar amb els numeros que hi han
     * dins del vector.    
     * @return Retorna el vector desitjat, dixant intacte el vector paràmetre.
     */
    
    public static int[] eliminaNoMultiplesV2(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return v;
        
        //Declaració de variables
        int i=0, iM=0;
        int[] res=new int[v.length]; //vector del mateix tipo i llargada que v
    
        while(i<v.length){
            if(v[i]%num==0){
                res[iM]=v[i];
                if(i!=iM) res[i]=-1;
                iM++;
            }else res[i]=-1;
            i++;
        }
        
        return res;
    
    }
    
    /**
     * El mètode farà el mateix que l'incrementar, i tractarà els nulls d'igual forma,
     * però actuarà de forma diferent segons si el paràmetre booleà és true o false:
     * - Si és true, els canvis es realitzaran sobre el vector passat com a paràmetre,
     * i el mètode retornarà null
     * - Si és false, no modificarem el vector rebut per paràmetre sinó que farem
     * un altre d'igual longitud on farem l'operació de suma (tal i com ho fa el mètode incrementar).
     * @param vector Nom que li assigno al vector que farem servir a este mètode.
     * @param quantitat S'utilitza per sumarli al vector el valor del propi paràmetre quantitat.
     * @param modifica Ens indica si o no està modificat. Solament caben aquestes dos opcions.
     * @return Si el vector és null retornarà null independentment del valor del paràmetre booleà,
     * si els nulls donen true, retornarem null ja que els canvis del vector es realitzaran
     * sobre el propi passat com a paràmetre, i si els nulls donen false, no modificarem
     * el vector rebut per paràmetre sinó que farem un altre d'igual longitud on farem
     * l'operació de suma (tal i com ho fa el mètode incrementar). Finalment retornarem
     * este altre vector en les modificacions. 
     */
    
    public static int[] operaVector(int[] vector, int quantitat, boolean modifica){
        //Casos especials
        if(vector==null) return null;
        
        //Declaració de variables
        int[] resultat=null;
        
        //Segur que vector no null
        if(modifica){
            
            for (int i = 0; i < vector.length; i++) {
                vector[i]+=quantitat;
            }
            
            
        }else{
            resultat=new int[vector.length];
            for (int i = 0; i < resultat.length; i++) {
                resultat[i]=vector[i]+quantitat;
            }
        }
        
        return resultat;
        
    }
    
    
}
