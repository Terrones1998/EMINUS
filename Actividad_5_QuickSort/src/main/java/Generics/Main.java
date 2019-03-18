
package Generics;


public class Main {
    
    public static void main(String args[]){
        
       Integer [] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        Integer [] result1 = Utils.ordena (intVector);
        for(Integer i: result1){
            System.out.print(i+" ");
        }
        System.out.println();
        Double [] floatVector = { 19.1, 456.6, 23.45, 12.34, 11.11, 354.55, 78.45, 28.33, 45.99, 108.88 };
        Double [] result2 = Utils.ordena (floatVector);
        for(Double i: result2){
            System.out.print(i+" ");
        }
        System.out.println();
        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        //String [] result3 = Utils.ordena (strVector);
        for(String i: strVector){
            System.out.print(i+" ");
        }
    }
}











