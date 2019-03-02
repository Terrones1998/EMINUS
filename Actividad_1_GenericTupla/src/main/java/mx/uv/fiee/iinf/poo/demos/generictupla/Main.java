package mx.uv.fiee.iinf.poo.demos.generictupla;

public class Main {

    public static void main(String[] args) {
        GenericTupla [] otVector= {
            new GenericTupla ("Santiago Bernabéu", 125000),
            new GenericTupla ("Camp Nou", 159000),
            new GenericTupla ("Old Trafford", 95000)
        };
        
        System.out.println (String.format ("Object\n\tEstadio con mayor capacidad: %s", estadioMayorCapacidad (otVector)));
        
    }
        
    public static String estadioMayorCapacidad (GenericTupla [] estadios) {
        int foo = -1;
        String result = "";
        
        for (int i = 0; i < estadios.length; i++) {
            int bar = (int) estadios [i].getSecond (); //casting from object to int
            if (bar > foo) {
                result = estadios [i].getFirst ().toString ();
                foo = (int) estadios [i].getSecond ();
            }
        }
        
        return result;
    }
    
}
