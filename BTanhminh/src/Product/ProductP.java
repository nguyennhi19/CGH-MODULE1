package Restaurant;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductP {
    List<Product> products = new ArrayList<>();
    public void add(){
        Product product1 = new Product("Gà rán", 20000, "nhỏ", 1);
        Product product2 = new Product("Gà rán", 25000, "vừa", 1);
        Product product3 = new Product("Gà rán", 30000, "lớn", 1);
        Product product4 = new Product("Phô mai que", 20000, "nhỏ", 1);
        Product product5 = new Product("Khoai tây chiên", 25000, "vừa", 1);
        Product product6 = new Product("Cá viên chiên", 30000, "lớn", 1);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
    }

    public void writeFile() throws IOException {
        File file =  new File("pet.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("pet.csv");
        byte[] b;
        for (int i = 0; i < products.size(); i++) {
            b = products.get(i).toString().getBytes();
            fileOutputStream.write(b);
        }
        fileOutputStream.flush();
    }

    public void readFile() throws IOException {
        File file = new File("product.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("product.csv");
        BufferedReader bufferedReader =  new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String[] arr = line.split(",");
            Product product1 = new Product(arr[0],Integer.parseInt(arr[1]),arr[2],Integer.parseInt(arr[3]));
            products.add(product1);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }
}
