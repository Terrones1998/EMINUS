
package Implementacion;


import java.util.LinkedList;


public class Pila<E> extends LinkedList<E> {

    public Pila(E element1,E element2,E element3,E element4,E element5) {
        
       this.push(element1);
       this.push(element2);   
       this.push(element3);
       this.push(element4);
       this.push(element5);
       
    }

    @Override
    public String toString() {
        return "Pila:\nPrimer elemento: "+this.getFirst()+"\nUltimo elemento: "+this.getLast();
    }
    
    
    
    
    
   
   
    
    

    
}











