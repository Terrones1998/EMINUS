
import java.util.ArrayList;

public class Utilities <N>{
   static int cont=0;
   
    public static<N>int ocurrences(ArrayList<N> list, N num)
    {
        for(N i: list)
        {
            System.out.println(i);
        }
        
        for(int k=0;k<list.size();k++)
        {
 
            if(list.get(k).equals(num))
            {
                cont++;
            }
        }
      return cont;
    }
    
}
