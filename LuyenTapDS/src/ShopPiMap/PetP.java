package ShopPiMap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetP {
    List<Pet> list = new ArrayList<>();
    public void pet(){
        Pet pe1 = new Pet("Mập địt",1 ,"đực","3/4","xám","Mèo anh lông ngắn",5000000,1,"Còn hàng");
        Pet pe2 = new Pet("Ny xinh đẹp",1 ,"cái","1/4","xám","Mèo anh lông ngắn",5000000,1,"Còn hàng");
        Pet pe3 = new Pet("My địt thúi",1 ,"cái","2/4","xám","Mèo anh lông ngắn",5000000,1,"Còn hàng");
        Pet pe4 = new Pet("Vàng đít bự",1 ,"đực","5/4","xám","Mèo anh lông ngắn",5000000,1,"Còn hàng");

        list.add(pe1);
        list.add(pe2);
        list.add(pe3);
        list.add(pe4);

    }

    Scanner sc = new Scanner(System.in);
    public void add(Pet pet){
        for (int i = 0 ; i < list.size();i++){
            if(list.get(i).getName().equals(pet.getName())){
                System.out.println("tel is d");
                return;
            }
        }
        System.out.println("input name");
        String name = sc.nextLine();

        System.out.println("input age");
        int age = sc.nextInt();
        String a = sc.nextLine();

        System.out.println("input gender");
        String gender = sc.nextLine();

        System.out.println("input date of birth");
        String db =sc.nextLine();

        System.out.println("input color");
        String color = sc.nextLine();

        System.out.println("input species");
        String species = sc.nextLine();

        System.out.println("input price");
        int price = sc.nextInt();

        System.out.println("input quantity");
        int  quantity = sc.nextInt();
        String abc = sc.nextLine();

        System.out.println("input status");
        String  status = sc.nextLine();

        Pet pe = new Pet( name, age, gender,db, color, species, price, quantity, status);
        list.add(pe);

    }

    public void delete(String name){
        for (int i = 0 ; i < list.size();i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                return;
            }
            System.out.println("Name is not available");
        }
    }
    public void edit(String nam){
        for ( int i = 0; i < list.size();i++){
            if (list.get(i).getName().equals(nam)){
                System.out.println("input name want to edit ");
                String name = sc.nextLine();
                list.get(i).setName(name);

                System.out.println("input age want to edit");
                int age = sc.nextInt();
                list.get(i).setAge(age);

                System.out.println("input gender want to edit");
                String gender = sc.nextLine();
                list.get(i).setGender(gender);

                System.out.println("input color want to edit");
                String color = sc.nextLine();
                list.get(i).setColor(color);

                System.out.println("input dateOfBirth want to edit");
                String bd = sc.nextLine();
                list.get(i).setDateOfBirth(bd);
                System.out.println("input species want to edit");
                String species = sc.nextLine();
                list.get(i).setSpecies(species);
                System.out.println("input price want to edit");
                int price = sc.nextInt();
                list.get(i).setPrice(price);
                System.out.println("input quantity want to edit");
                int quantity = sc.nextInt();
                list.get(i).setQuantity(quantity);
                System.out.println("input status want to edit");
                String status = sc.nextLine();
                list.get(i).setStatus(status);
            }
        }
    }
    public void find(String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
                return;
            }
        }
        System.out.println("Name is not availble");
    }
    public void saveFile() throws IOException {
//        File file =  new File("pet.csv");
//        if(!file.exists()){
//            file.createNewFile();
//        }
        FileOutputStream fileOutputStream = new FileOutputStream("pet.csv", true );
        byte[] b;
        for (int i = 0; i < list.size(); i++) {
            b = list.get(i).toStringCSV().getBytes();
            fileOutputStream.write(b);
        }
        fileOutputStream.flush();
    }
    public void readFile() throws IOException {
        File file = new File("pet.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("pet.csv");
        BufferedReader bufferedReader =  new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String[] arr = line.split(",");
            Pet pet1 = new Pet(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3],arr[4],arr[5],Integer.parseInt(arr[6]),Integer.parseInt(arr[7]),arr[8]);
            System.out.println(pet1.toString());
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void display(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
