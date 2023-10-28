import java.lang.Math;
public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public static void main(String[]args){
        double radius=5.0;
        Circle circle =new Circle(radius);
        System.out.println("Radius:"+circle.getRadius());
       System.out.println("Area:"+circle.calculateArea());
       System.out.println("Perimeter(Circumference):"+circle.calculatePerimeter());
    }
}