
import java.util.ArrayList;


public class Main {
    
    public static void main(String args[]){
        
        int max,min;
        ArrayList<Integer> list = new ArrayList <> ();
        
        for(int i=0; i<25; i++)
        {
           list.add(aleatorio(1,11)); 
        }
        
        Integer foo = 10;
        Integer count = Utilities.ocurrences(list, foo); //Llamada al método genérico
       
        String bar = String.format("El elemento %d aparece en la lista de %d veces",foo,count);
        System.out.println(bar);
    }
    
    static int aleatorio(int min,int max)
    {
        double x=Math.random();
        return ((int)(x*(max-min)+min));
    }
    
}
