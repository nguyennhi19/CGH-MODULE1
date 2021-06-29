package QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public  QuadraticEquation(){

    }
    public  QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta;
        return delta = this.b*2 - 4*this.a*this.c;
    }
    public double getRoot1(){
        double r1;
        return r1=((-this.b)+Math.sqrt(getDiscriminant())/2*this.a);
    }
    public double getRoot2(){
        double r2;
        return r2=((-b)-Math.sqrt(getDiscriminant())/2*a);
    }
    public String Check(){
        if(getDiscriminant()>=0){
            return String.format("r1: %f\n r2: %f",getRoot1(),getRoot2());
        }
        return "“The equation has no roots”";
    }
//    public String Display(){
//
//    }
}
