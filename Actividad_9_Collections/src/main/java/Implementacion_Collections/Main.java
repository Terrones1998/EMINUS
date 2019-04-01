
package Implementacion_Collections;


public class Main {
    public static void main(String[] args){
        
        MyCollection<String> myStrCollection = new MyCollection<>();
        
        myStrCollection.add("Obiwan");
        myStrCollection.add("Anakin");
        myStrCollection.add("Lea");
        myStrCollection.add("Rey");
        
        MyCollection<Double> myDblCollection = new MyCollection<>();
        
        myDblCollection.add(1.0);
        myDblCollection.add(2.0);
        
        print(myStrCollection);
        print(myDblCollection);
       
    }
    
   public static<T> void print(T collection){
       
         System.out.println(collection);
         
     
   }
    
}







