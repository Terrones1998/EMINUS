package mx.uv.fiee.iinf.poo.genericshapescontainer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main (String [] args) {
        
        ShapeStorage<ArrayList,Shape> manager = new ShapeStorage<>(new ArrayList<Shape>());
        
        manager.add(new Circle(10,10,20));
        manager.add(new Circle(15,20,20));
        manager.add(new Square(30,30));
        manager.add(new Triangle(25,40));
        
        Shape shape = manager.get(0);
        System.out.println(shape);
    }
    
}








