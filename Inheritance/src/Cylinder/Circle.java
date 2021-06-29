package Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + this.color
                + " and radius= "
                + this.radius;
    }

}
//classCircleTest {
//    public static void main(String[] args) {
//        Circle circle = new Circle(1.5, "black");
//        System.out.println(circle.toString());
//    }
//}

class Cylinder extends Circle{
    private  double height;


    public Cylinder (double radius,String color, double height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return super.getArea()*2+super.getPerimeter()*this.height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }
    @Override
    public String toString(){
        return  "A Cylinder with height ="
                +getHeight()
                + " and area="
                +getArea()
                + " and volume="
                +getVolume()
                +",which is a subclass of"
                +super.toString();
    }

}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder= new Cylinder(3,"black",5);
        System.out.println(cylinder);
    }
}

