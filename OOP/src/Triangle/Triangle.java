package Triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;
    private double s;
    private double p;
    private String color;

    public Triangle(){

    }
    public Triangle(double a,double b, double c, String color){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
        this.color=color;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c=c;
    }
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getH(){
        return (2*Math.sqrt(this.p*(this.p-this.a)*(this.p-this.b)*(this.p-this.c))/this.a);
    }
    public double getS(){
        return this.a*this.h/2;
    }
    public double getP(){
        return (this.a+this.b+this.c)/2;
    }

}
