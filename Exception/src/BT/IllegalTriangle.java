package BT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangle {
    static void checkTriangle(int a, int b, int c)  {
        try {

            if (a > 0 && b > 0 && c > 0) {
                System.out.println(("a,b,c > 0"));
            }else {
                throw new InputMismatchException("write what message you want printed");
            }

            if (a + b >= c || a + c >= b || c + b >= a) {
                System.out.println("is  triangle");
            }
        } catch (InputMismatchException e) {
            System.out.println("is not triangle");
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = input.nextInt();

        System.out.println("Enter b :");
        int b = input.nextInt();

        System.out.println("Enter c :");
        int c = input.nextInt();
        checkTriangle(a, b, c);
    }
}
