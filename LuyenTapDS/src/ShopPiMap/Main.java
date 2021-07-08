package ShopPiMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetService petService = new PetService();
        Scanner sc =  new Scanner(System.in);
//        Pet per = new Pet();
//        petService.saveFile();
        int choose;
        while (true){
            creatMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    petService.pet();
                    petService.display();
                    break;
                case 2:
                    petService.addPet();
                    break;
                case 3:
                    System.out.println("input name want to edit");
                    petService.edit();
                    break;
                case 4:
                    System.out.println("input name want to delete");
                    petService.delete();
                    break;
                case 5:
                    System.out.println("input name want to find");
                    petService.find();
                    break;
                case 6:
                    petService.readFile();
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
        System.out.println("WELCOME !!! ");
        System.out.println("1. SEE LIST ");
        System.out.println("2. ADD Pet ");
        System.out.println("3. EDIT  ");
        System.out.println("4. DELETE ");
        System.out.println("5. FIND");
        System.out.println("6. READ FROM FILE ");
        System.out.println("7. WRITE IN FILE");
        System.out.println("0. EXIT");
    }
}
