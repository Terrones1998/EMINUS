
package Generics;


public class Main {
    
    public static void main(String args[]){
        
       Integer[] intVector={101,99,12,19,21,111,345,25,77,81};
        
        Integer[] result=Utils.ordena(intVector,0,9);
        
        Double[] floatVector={19.1,456.6,23.45,12.34,11.11,354.55,78.45,28.33,45.99,108.88};
        
        Double[] result1=Utils.ordena(floatVector,0,9);
        
        for(int x: result)
        {
            System.out.println(x);
        }
       
//        String[] strVector={"zz","aa","cc","hh","bb","ee","ll"};
//        String[] result=Utils.ordena(strVector);
    }
}










