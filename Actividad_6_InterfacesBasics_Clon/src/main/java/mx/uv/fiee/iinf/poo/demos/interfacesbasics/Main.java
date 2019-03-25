package mx.uv.fiee.iinf.poo.demos.interfacesbasics;

public class Main {

    public static void main (String [] args) throws CloneNotSupportedException{
//        Drawable [] shapes = {
//            new Circle (),
//            new Rectangle ()
//        };
//        
//        System.out.println (shapes [0]); 

        
        Circle original = new Circle (10, 20, 1);
        Circle copia = original.clone();
        
        Rectangle orig = new Rectangle (10,10,20,20);
        Rectangle copy = orig.clone();
        
        System.out.println("Original: "+original.toString());
        System.out.println("Copia: "+copia.toString());
        System.out.println("");
        System.out.println("Original: "+orig.toString());
        System.out.println("Copia: "+copy.toString());
        
        
    }
    
}
