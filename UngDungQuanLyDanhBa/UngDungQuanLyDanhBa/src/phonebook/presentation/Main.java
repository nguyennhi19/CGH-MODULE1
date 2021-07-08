package phonebook.presentation;

import phonebook.model.Pet;
import phonebook.service.PetService;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetService phoneBookService = new PetService();
        try {
            phoneBookService.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int choose;
        do {
            creatMenu();
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    printPhoneBook();
                    break;
                case 2:
                    try {
                        addPhoneBook();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        editPhoneBook();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        delete();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        findPhoneBook();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        readToFile();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        writeToFile();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    exit();
                    break;
            }
        }while (choose != 8);
    }

    public static void creatMenu(){
        System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ -----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("------------------------------------------");
    }

    public static void printPhoneBook(){
        PetService pbs = new PetService();
        pbs.printPhoneBook();
        System.out.println("Danh sách đang có " + pbs.size());
    }

    public static void addPhoneBook() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin:");

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại(yêu cầu số điện thoại hợp lệ): ");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        System.out.println("Nhóm của danh bạ: ");
        String groupName = scanner.nextLine();

        System.out.println("Nhập tên:");
        String name = scanner.nextLine();

        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();

        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();

        String dateOfBirth;
        do {
            System.out.println("Nhập ngày tháng năm sinh hợp lệ(MM/DD/YYYY hoặc MM-DD-YYYY): ");
            dateOfBirth = scanner.nextLine();
        }while (checkInputDateOfBirth(dateOfBirth) == false);

        String email;
        do {
            System.out.println("Nhập email hợp lệ:");
            email = scanner.nextLine();
        }while (checkInputEmail(email) == false);

        Pet phoneBook = new Pet(phoneNumber,groupName,name,gender,address,dateOfBirth,email);
        PetService phoneBookService = new PetService();
        Pet phoneBook1 = phoneBookService.find(phoneNumber);
        if (phoneBook.equals(phoneBook1)){
            System.out.println("Số điện thoại đã tồn tại:");
            System.out.println(phoneBook1.toString());
        }else {
            phoneBookService.add(phoneBook);
            System.out.println("Bạn đã thêm " + phoneBook.getName() + " vào danh bạ thành công!");
        }
    }

    public static void findPhoneBook(){
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại cần tìm kiếm(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        PetService phoneBookService = new PetService();
        Pet phoneBook = phoneBookService.find(phoneNumber);
        if (phoneBook == null){
            System.out.println("Không tồn tại");
        }else {
            System.out.println(phoneBookService.find(phoneNumber).toStringInfo());
        }
    }

    public static void delete() throws Exception{
        PetService phoneBookService = new PetService();
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại cần xóa(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        Pet phoneBook = phoneBookService.find(phoneNumber);
        if (phoneBook == null){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }else {
            System.out.println(phoneBookService.find(phoneNumber).toString());
            phoneBookService.remove(phoneNumber);
            System.out.println("Đã xóa thành công!");
        }
    }

    public static void editPhoneBook() throws Exception{
        Scanner scanner = new Scanner(System.in);
        PetService phoneBookService = new PetService();


        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        Pet phoneBook = phoneBookService.find(phoneNumber);
        if (phoneBook == null){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }else {
            System.out.println(phoneBookService.find(phoneNumber));
            System.out.println("Nhâp thông tin mới:");

            System.out.println("Nhóm của danh bạ");
            String groupName = scanner.nextLine();
            phoneBook.setGroupName(groupName);

            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            phoneBook.setName(name);

            System.out.println("Giới tính:");
            String gender = scanner.nextLine();
            phoneBook.setGender(gender);

            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            phoneBook.setAddress(address);

            String dateOfBirth;
            do {
                System.out.println("Nhập ngày tháng năm sinh hợp lệ(MM/DD/YYYY hoặc MM-DD-YYYY):");
                dateOfBirth = scanner.nextLine();
            }while (checkInputDateOfBirth(dateOfBirth) == false);
            phoneBook.setDateOfBirth(dateOfBirth);

            String email;
            do {
                System.out.println("Nhập email hợp lệ:");
                email = scanner.nextLine();
            }while (checkInputEmail(email) == false);
            phoneBook.setEmail(email);

            System.out.println("Cập nhật thành công!");
            System.out.println(phoneBookService.find(phoneNumber).toString());
            phoneBookService.updateFile();
        }
    }

    public static void exit(){
        System.out.println("Đã thoát");
        System.exit(0);
    }

    public static boolean  checkInputEmail(String email){
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}+[\\w+mail]|[outlook]+.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean checkInputDateOfBirth(String dateOfBirth){
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateOfBirth);
        return matcher.find();
    }

    public static boolean checkInputPhoneNumber(String phone){
        String regex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.find();
    }

    public static void readToFile() throws Exception{
        PetService phoneBookService = new PetService();
        phoneBookService.printPhoneBook();
    }

    public static void writeToFile() throws Exception{
        System.out.println("Đang tiến hành ghi vào file...");
        PetService phoneBookService = new PetService();
        phoneBookService.updateFile();
        System.out.println("Ghi vào file thành công");
    }
}
