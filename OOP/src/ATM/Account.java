package ATM;

import java.util.ArrayList;

public class Account {
    private String name = "Nguyen Van A";
    private int amount = 1200000;
    ArrayList<String> tradeHistory = new ArrayList<String>();

    public Account(){

    }

    public Account(String name, int amount){
        this.name=name;
        this.amount=amount;
    }


    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Withdrawal(int amount1){
        if(amount1 <= amount){
            return "Số tiền trong tài khoản: " + (amount- amount1);
        }
        else return "không đủ số dư";
    }

    public void checkTradeHistory() {
        for(int i = tradeHistory.size() - 1, j = 1; i > tradeHistory.size() - 4 && i >= 0; i--, j++) {
            System.out.println(j + ". " + tradeHistory.get(i));
        }
        System.out.println("Bam nut theo menu de tiep tuc dich vu ATM");
        System.out.println("===========================================");
    }

    public String recharge(int amount1){
        return "số tiền trong tài khoản: "+(amount+amount1);
    }

}
