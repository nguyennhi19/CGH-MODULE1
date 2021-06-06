import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        float rate=23000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Amount USD: ");
        float AmountUSD=sc.nextFloat();
        float AmountVND=AmountUSD*rate;
        System.out.println("VND amount is: "+AmountVND);
    }
}
