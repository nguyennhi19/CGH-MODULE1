package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Menu:");
        System.out.println("1. Kiem tra ban");
        System.out.println("2. Dat ban");
        System.out.println("3. Danh muc san pham");
        System.out.println("4. Bill");
        System.out.println("5. Thanh toan");


        while (true) {
            System.out.print("Enter your choice ");
            choice = scan.nextInt();

//            switch (choice) {
//                case 1:
//                    System.out.println("So ban da dat:");
//                    System.out.println("So ban trong:");
//                case 2:
//                    if (isAllTableOccupie()) {
//                        System.out.println("The table is fully booked!!!");
//                    } else {
//                        displayBookedTable();
//                    }
//                case 3:
//                    readFile("src\\Data\\ListProduct");
//            }
        }
    }
}
