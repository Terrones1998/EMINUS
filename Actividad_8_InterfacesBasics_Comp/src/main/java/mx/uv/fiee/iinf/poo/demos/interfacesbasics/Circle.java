package mx.uv.fiee.iinf.poo.demos.interfacesbasics;

public class Circle implements Comparable<Circle> {
    
    private double x, y, radius;

    public Circle  () {}
    
    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getX () {
        return x;
    }

    public void setX (double x) {
        this.x = x;
    }

    public double getY () {
        return y;
    }

    public void setY (double y) {
        this.y = y;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }
    
     public Double area () {
        return Math.PI * Math.pow (radius, 2.0);
     }
//    @Override
//    public void draw(int color) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public void fill(int color) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public double calculateArea() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



    @Override
    public int compareTo(Circle o) {
       return this.area().compareTo(o.area());
 
    }
    
}
