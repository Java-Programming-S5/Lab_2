package pe6;

public class Circle {
    private double radius;
    private final static double PI = 3.14159;

    public Circle(){
        this.radius = 0.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){ return radius;}
    public void setRadius(double radius) { this.radius = radius;}

    public double getArea() {
        return PI*radius*radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public double getCircumference(){
        return 2*PI*radius;
    }


}
