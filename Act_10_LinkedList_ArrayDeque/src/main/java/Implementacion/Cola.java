
package Implementacion;

import java.util.ArrayDeque;



public class Cola<E> extends ArrayDeque<E> {

    public Cola(E element1,E element2,E element3,E element4,E element5) {
       this.addLast(element1);
       this.addLast(element2);   
       this.addLast(element3);
       this.addLast(element4);
       this.addLast(element5);
       
       
    }

    @Override
    public String toString() {
        return "Cola:\nPrimer elemento: "+this.getFirst()+"\nUltimo elemento: "+this.getLast();
    }
    
    
    
   
    
}










