package Circle;

public class Cir {
    public static void main(String[] args) {
        Circle circle = new Circle();
        test(circle);
        circle.setRadius(3);
        circle.setColor("black");
        test(circle);
    }
    public static void test(Circle Cir){
//        System.out.println(Cir.getRadius());
//        System.out.println(Cir.getColor());
//        System.out.println(Cir.getArea());
        System.out.println(Cir.toString());

    }

}
