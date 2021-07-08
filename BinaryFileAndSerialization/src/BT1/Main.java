package BT1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"cát nhật","like",50000,"cát thơm, mùi táo, ít bụi"));
        products.add(new Product(1,"cát nhật","like",50000,"cát thơm, mùi cà phê, ít bụi"));
        products.add(new Product(1,"cát nhật","like",50000,"cát thơm, mùi chanh, ít bụi"));
        products.add(new Product(1,"cát nhật","like",50000,"cát thơm, mùi hoa hồng, ít bụi"));
        products.add(new Product(2,"Cát lite","lite",55000,"cát thơm, mùi cà phê, ít bụi"));
        products.add(new Product(2,"Cát lite","lite",55000,"cát thơm, mùi chanh, ít bụi"));
        products.add(new Product(2,"Cát lite","lite",55000,"cát thơm, mùi táo, ít bụi"));
        products.add(new Product(2,"Cát lite","lite",55000,"cát thơm, mùi hoa hồng, ít bụi"));
        writeToFile("product.csv",products);
        List<Product> productDataFromFile =  readDataFromFile("product.csv");
        for(Product product : productDataFromFile){
            System.out.println(product);
        }
    }
}
