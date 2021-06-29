package Point;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f ;

    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed,float x, float y){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float ySpeed,float xSpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float arr[]= new float[2];
        arr[0]=getXSpeed();
        arr[1]=getYSpeed();
        return arr;
    }


    public String toString() {
        return "(X = " + super.getX() + " || Y = " + super.getY() +"), speed = (" + getXSpeed() + ", " + getYSpeed() + ")";
    }

    public MovablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);

        return this;
    }
}
class TestMovablePoint{
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        movablePoint.setSpeed(4,5);
        System.out.println(movablePoint.toString());
        System.out.println(Arrays.toString((movablePoint).getSpeed()));
    }
}
