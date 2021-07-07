import Pet.PetService;
import Shop.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("** SHOP PI MẬP **");
        System.out.println("Địa chỉ của shop: ");
        System.out.println(shop.getAddress());
        System.out.println();
        System.out.println("Xin chào !!! ");
        PetService petService = new PetService();
        Scanner sc =  new Scanner(System.in);
        petService.saveFile();

        int choose;
        while (true){
            creatMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    petService.display();
                    break;
                case 2:
                    petService.addPet();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm bạn muốn sửa");
                    petService.edit();
                    break;
                case 4:
                    System.out.println("Nhập tên sản phẩm bạn muốn xóa");
                    petService.delete();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm");
                    petService.find();
                    break;
                case 6:
                    petService.readFile() ;
                    break;
                case 7:
                    petService.saveFile();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void creatMenu(){

        System.out.println("1. Xem danh sách sản phẩm ");
        System.out.println("2. Thêm sản phẩm ");
        System.out.println("3. Sửa sản phẩm  ");
        System.out.println("4. Xóa sản phẩm ");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Đọc File ");
        System.out.println("7. Viết file ");
        System.out.println("0. Thoát ");
        System.out.println("\n========================");

    }
}
