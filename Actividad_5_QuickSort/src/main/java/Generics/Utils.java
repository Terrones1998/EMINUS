
package Generics;


public class Utils {

   

   public static<N extends Number>N[] ordena(N[] vec,int izq,int der){
      
       N pivote=vec[izq];
       int i=izq;
       int j=der;
       N aux;
       
     
       while(i<j){
           while(vec[i] <= pivote && i<j)
               i++;
           while(vec[j] > pivote)
               j--;
           if(i<j){
               aux=vec[i];
               vec[i]=vec[j];
               vec[j]=aux;
           }
       }
       vec[izq]=vec[j];
       vec[j]=pivote;
       if(izq<j-1)
           ordena(vec,izq,j-1);
       if(j+1<der)
           ordena(vec,j+1,der);
       
       
            return vec;
    }

    
}








