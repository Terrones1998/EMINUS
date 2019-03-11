package mx.uv.fiee.iinf.poo.genericshapescontainer;

public class Triangle extends Shape {
    double base;
    double height;
    
    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public Double area () {
        return base * height / 2;
    }
}
