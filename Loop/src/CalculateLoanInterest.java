package src;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;
        double total_interset = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: \n" );
        money = input.nextDouble();

        System.out.print("Enter the number of month: \n");
        month = input.nextInt();

        System.out.print("Enter anual interset rate in percentage: ");
        interest_rate = input.nextDouble();

        for (int i=0;i<month;i++){
            total_interset += money*(interest_rate/100)*12*month;
        }
        System.out.printf("Total of interset: %f ",total_interset);
    }
}
