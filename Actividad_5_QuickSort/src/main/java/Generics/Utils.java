
package Generics;


public class Utils {

    public static <T extends Number> T[] ordena(T[] arreglo){        
        quicksort(arreglo,0,arreglo.length-1);
        return arreglo;
    }
    private static <T extends Number> void quicksort(T[] arreglo, int izq, int der) {
        if (izq < der) {
            int i = izq, j = der;
            T central = arreglo[(i + j) / 2];

            do {
                while (arreglo[i].doubleValue() < central.doubleValue()) i++;
                while (central.doubleValue() < arreglo[j].doubleValue()) j--;

                if ( i <= j) {
                    T tmp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            quicksort(arreglo, izq, j);
            quicksort(arreglo, i, der);
        }
    }
  
}










