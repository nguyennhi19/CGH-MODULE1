package Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobile Iphone = new Mobile("iPhone","hello");
        Mobile Samsung =new Mobile("Samsung","hi");

        Scanner input=new Scanner(System.in);


        int choice = -1;
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. i to s ");
            System.out.println("2. s to i ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Soạn tin nhắn: ");
                    Iphone.setMessenger("chào a");
                    System.out.println("tin nhắn đến: "+Iphone.getMessenger());
                    break;
                case 2:
                    System.out.println("Soạn tin nhắn: ");
                    Samsung.setMessenger("chào a");
                    System.out.println("tin nhắn đến: "+Samsung.getMessenger());

                    break;
                case 3:

                    break;
                case 0:

                default:

            }
        }



    }
}
