import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Emter the Celsius: ");
                    celsius = input.nextDouble();
                    System.out.printf("Celsius to Fahrenheit: %.0f°F\n", celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.printf("Enter the Fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.printf("Fahrenheit to Celsius: %.0f°C\n", celsiusToFahrenheit(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;

    }
}
