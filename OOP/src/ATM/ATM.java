package ATM;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class ATM  {
    public static void main(String[] args) {

        Account ac =new Account();
        System.out.println("Xin chào quý khách !");
        System.out.println(" Đăng nhập vào tài khoản");
        int choice;
        int amount;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Menu");
            System.out.println("1. Rut tien");
            System.out.println("2. Nap tien vao tai khoan");
            System.out.println("3. Kiem tra so du");
            System.out.println("4. Kiem tra lich su");
            System.out.println("0. Thoat");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Số tiền bạn muốn rút: ");
                    amount = input.nextInt();
                    String amount1 = ac.Withdrawal(amount);
                    System.out.println("Bạn đã rút " + amount1 );
                    System.out.println(amount1);

                    break;
                case 2:
                    System.out.println("Số tiền bạn muốn nạp: ");
                    amount = input.nextInt();
                    String amount2 = ac.recharge(amount);
                    System.out.println("Bạn đã nạp " + amount2 + " vào tài khoản. ");
                    System.out.println(amount2);

                    break;
                case 3:
                    int amount3=ac.getAmount();
                    System.out.println("Số dư trong tài khoản: "+amount3);
                    break;
                case 4:
                    System.out.println("lich su: ");
                    ac.checkTradeHistory();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
