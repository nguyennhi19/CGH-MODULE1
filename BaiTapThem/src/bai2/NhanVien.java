package bai2;

import java.util.Scanner;

public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int workingTime;

    public NhanVien(){

    }

    public NhanVien(String name, int age, String address, double salary, int workingTime){
        this.name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
        this.workingTime=workingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên của nhân viên: ");
        name=sc.nextLine();
        setName(name);
        System.out.println("Nhập tuổi của nhân viên: ");
        age=sc.nextInt();
        setAge(age);
        System.out.println("Nhập địa chỉ của nhân viên: ");
        address=sc.nextLine();
        setAddress(address);
        System.out.println("Nhập lương của nhân viên: ");
        salary=sc.nextDouble();
        setSalary(salary);
        System.out.println("Nhập tổng số giờ của nhân viên: ");
        workingTime=sc.nextInt();
        setWorkingTime(workingTime);
    }

    public void printInfo(){
        getName();
        getAge();
        getAddress();
        getSalary();
        getWorkingTime();
    }

    public double bonus(){
        double bonus;
        if(workingTime >= 200){
            return bonus = salary * 20 / 100;
        }
        if(workingTime >= 100 && workingTime < 200){
            return bonus = salary * 10 / 100;
        }else
            return bonus = 0;
    }
}
