package Circle;

public class Circle {
    private double radius=1.0;
    private String color ="red";
//    final private double pi=3.14;

    public Circle(){

    }
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "A Circle with:\n\tColor is: " +  getColor() + "\n\tRadius =" + getRadius() + "\n\tArea =" + getArea();
    }
}
