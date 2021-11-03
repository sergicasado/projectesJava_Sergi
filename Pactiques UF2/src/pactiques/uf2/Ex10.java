/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques.uf2;

/**
 *
 * @author Sergi
 */
public class Ex10 {
    
    public static void main(String[] args) {
        
        System.out.println(areaTriangle(2,3,4));
        System.out.println(areaTriangle(1,1,1));
        
        
    }
    
    public static double areaTriangle(double costatA, double costatB, double costatC){
        
        
        double p = (costatA+costatB+costatC)/2;
        double area = Math.sqrt(p*(p-costatA)*(p-costatB)*(p-costatC)) ;;
        return area;
    }
}
