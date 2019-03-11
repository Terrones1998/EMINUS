package mx.uv.fiee.iinf.poo.genericshapescontainer;

public class Circle extends Shape {
    int x, y;
    int radius;
    
    public Circle (int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public Double area () {
        return Math.PI * Math.pow (radius, 2.0);
    }
}