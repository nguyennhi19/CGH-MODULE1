package Car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public  Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setEngine(String name) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }




}
