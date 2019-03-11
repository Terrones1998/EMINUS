package mx.uv.fiee.iinf.poo.genericshapescontainer;

public class Square extends Shape {
    double sizeA;
    double sizeB;
    
    public Square (double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }
    
    @Override
    public Double area () {
        return sizeA * sizeB;
    }
}