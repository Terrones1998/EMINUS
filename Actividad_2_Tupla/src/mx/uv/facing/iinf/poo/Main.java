
package mx.uv.facing.iinf.poo;

public class Main {

    public static void main(String[] args) {
//        ObjectTupla [] otVector = {
//            new ObjectTupla ("Santiago Bernabéu", 125000),
//            new ObjectTupla ("Camp Nou", 159000),
//            new ObjectTupla ("Old Trafford", 95000)
//        };
        
        //System.out.println (String.format ("Object\n\tEstadio con mayor capacidad: %s", estadioMayorCapacidad (otVector)));
                
        GenericTupla [] gtVector = {
            new GenericTupla<> ("Santiago Bernabéu", 125000),
            new GenericTupla<> ("Camp Nou", 159000),
            new GenericTupla<> ("Old Trafford", 95000)
        };
    
        GenericTupla<Double,Double> point1= gtVector[0];
        GenericTupla<Double,Double> point2= gtVector[1];
        boolean isEqual = Utilities.Compare(point1, point2);

        System.out.println (String.format ("\tEstadio con mayor capacidad: %s", estadioMayorCapacidad (gtVector)));
        System.out.println (String.format ("\tComparación entre Tupla 1 y Tupla 2: %s",  isEqual));
    }
        
    public static String estadioMayorCapacidad (GenericTupla [] estadios) {
        int foo = -1;
        String result = "";
        
        for (int i = 0; i < estadios.length; i++) {
            int bar = ((Number) estadios [i].getValue ()).intValue (); //casting from object to int
            if (bar > foo) {
                result = estadios [i].getKey ().toString ();
                foo = (int) estadios [i].getValue ();
            }
        }
        
        
        return result;
    }
    
}
