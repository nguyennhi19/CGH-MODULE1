package Car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(car1.getName());
        car1.setName("toyota");
        System.out.println(car1.getName());
        Car car2 = new Car("Mazda  6","Skyactiv 6");
        System.out.println(car2.getName());
    }
}
