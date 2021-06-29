package Fan;

public class Fan {
     final private int SLOW = 1,  MEDIUM = 2, FAST = 3;
     private int speed = SLOW;
     private boolean on = false;
     private double radius = 5;
     private String color ="blue";

     public Fan(){

     }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getFAST() {
        return FAST;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSLOW() {
        return SLOW;
    }

    public String toString(){
         if(on){
             return "Fan {" + "on: " + getSpeed() +" "+ getColor()+" "+getRadius()+" fan is on"+ "}";
         }else return   "Fan {" + "off: " +  getColor() +" "+ getRadius()+" fan is off"+"}";
//         return "Fan{" + "on: " + getSpeed() + getColor()+getRadius()+"fan is on"
//                 +     ", off: " + getColor()+getRadius()+"fan is off" + "}";

    }


}
