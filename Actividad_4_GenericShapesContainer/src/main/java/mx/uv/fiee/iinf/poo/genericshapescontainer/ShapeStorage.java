
package mx.uv.fiee.iinf.poo.genericshapescontainer;

import java.util.List;

 class ShapeStorage<T extends List, U> {

   private final T arrayShapes;
   
    ShapeStorage(T array){
        arrayShapes = array;
    }
    
    public void add(U shape){
        arrayShapes.add(shape);
    }
    
    public U get(int i){
        return (U)arrayShapes.get(i);
    }
    
       
}
