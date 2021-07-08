import Model.DanhBa;
import Service.DanhBaService;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        DanhBaService danhBaService = new DanhBaService();
//        try {
//            danhBaService.loadData();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        int choose;
        do {
            creatMenu();
            Scanner sc = new Scanner(System.in);
            do {
                while (!sc.hasNextInt()){
                    System.out.println("Hãy nhập lại số:");
                    sc.next();
                }
                choose = sc.nextInt();}
            while (choose<0);
            switch (choose){
                case 1:
                    print();
                    break;
                case 2:
                    try {
                        add();
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
                        find();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
//                    DanhBaService danhBaService = new DanhBaService();
//                    try {
//                        danhBaService.loadData();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }

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
        System.out.println("7. Lưu vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:  ");
        System.out.println("------------------------------------------");
    }

    public static void print(){
        DanhBaService dbs = new DanhBaService();
        dbs.print();
        System.out.println("Danh sách đang có " + dbs.size());
    }

    public static void add() throws Exception{
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

        DanhBa danhBa = new DanhBa(phoneNumber,groupName,name,gender,address,dateOfBirth,email);
        DanhBaService danhBaService = new DanhBaService();
        DanhBa danhBa1 = danhBaService.find(phoneNumber);
        if (danhBa.equals(danhBa1)){
            System.out.println("Số điện thoại đã tồn tại:");
            System.out.println(danhBa1.toString());
        }else {
            danhBaService.add(danhBa);
            System.out.println("Bạn đã thêm " + danhBa.getName() + " vào danh bạ thành công!");
        }
    }

    public static void find(){
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại cần tìm kiếm(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        DanhBaService danhBaService = new DanhBaService();
        DanhBa danhBa = danhBaService.find(phoneNumber);
        if (danhBa == null){
            System.out.println("Không tìm được danh bạ có số điện thoại trên");
        }else {
            System.out.println(danhBaService.find(phoneNumber).toStringInfo());
        }
    }

    public static void delete() throws Exception{
        DanhBaService danhBaService = new DanhBaService();
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại cần xóa(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        DanhBa danhBa = danhBaService.find(phoneNumber);
        if (danhBa == null){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }else {
            System.out.println(danhBaService.find(phoneNumber).toString());
            danhBaService.remove(phoneNumber);
            System.out.println("Đã xóa thành công!");
        }
    }

    public static void editPhoneBook() throws Exception{
        Scanner scanner = new Scanner(System.in);
        DanhBaService danhBaService = new DanhBaService();


        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại(yêu cầu số điện thoại hợp lệ):");
            phoneNumber = scanner.nextLine();
        }while (checkInputPhoneNumber(phoneNumber) == false);

        DanhBa danhBa = danhBaService.find(phoneNumber);
        if (danhBa == null){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }else {
            System.out.println(danhBaService.find(phoneNumber));
            System.out.println("Nhâp thông tin mới:");

            System.out.println("Nhóm của danh bạ");
            String groupName = scanner.nextLine();
            danhBa.setGroupName(groupName);

            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            danhBa.setName(name);

            System.out.println("Giới tính:");
            String gender = scanner.nextLine();
            danhBa.setGender(gender);

            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            danhBa.setAddress(address);

            String dateOfBirth;
            do {
                System.out.println("Nhập ngày tháng năm sinh hợp lệ(MM/DD/YYYY hoặc MM-DD-YYYY):");
                dateOfBirth = scanner.nextLine();
            }while (checkInputDateOfBirth(dateOfBirth) == false);
            danhBa.setDateOfBirth(dateOfBirth);

            String email;
            do {
                System.out.println("Nhập email hợp lệ:");
                email = scanner.nextLine();
            }while (checkInputEmail(email) == false);
            danhBa.setEmail(email);

            System.out.println("Cập nhật thành công!");
            System.out.println(danhBaService.find(phoneNumber).toString());
            danhBaService.updateFile();
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
        DanhBaService danhBaService = new DanhBaService();
        try {
            danhBaService.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() throws Exception{
        System.out.println("Đang tiến hành ghi vào file...");
        DanhBaService danhBaService = new DanhBaService();
        danhBaService.updateFile();
        System.out.println("Ghi vào file thành công");
    }
}
