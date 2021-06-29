package Bai1;

import java.util.Scanner;

public class SoHoc {
    private int number1;
    private int number2;

    public SoHoc(){

    }

    public SoHoc(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập number1: ");
        number1=sc.nextInt();
        setNumber1(number1);
        System.out.println("Nhập number2: ");
        number2=sc.nextInt();
        setNumber2(number2);
    }

    public void printInfo(){
        getNumber1();
        getNumber2();
    }

    public int addition(){
        return number1+number2;
    }

    public int subtract(){
        return number1-number2;
    }

    public int multi(){
        return number1*number2;
    }

    public int division(){
        return number1/number2;
    }
}
