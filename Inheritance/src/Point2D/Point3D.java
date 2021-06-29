package Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float z){
        this.z=z;
    }
    public Point3D(float x, float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float y, float x, float z) {
        super.setX(x);
        super.setY(y);
        this.z=z;
    }

    public float[] getXYZ() {
        float arr[]=new  float[3];
        arr[0]=super.getX();
        arr[1]=super.getY();
        arr[2]=getZ();
        return arr;
    }


    public String toString() {
        return String.format("X = %f\tY = %f\tZ = %f\n%s",getX(),getY(),getZ(), Arrays
                .toString(getXYZ()));
    }

}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setXYZ(4,6,2);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString((point3D).getXYZ()));
    }
}




