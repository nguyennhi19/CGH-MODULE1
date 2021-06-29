package BT1;

import java.util.ArrayList;
import java.util.Collection;

public class PronductManager {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("Computer");
        list.add("Main");
        list.add("Ram");
        list.add("SSD");
        list.add("Màn hình");
        list.add("Laptop");
        list.add("Iphone");
        System.out.println(list);
        System.out.println("Sản phẩm có giá trị là Main: "+list.contains("Main"));
        list.remove("SSD");
        System.out.println("Có "+list.size()+" trong kho hàng");
        Collection collection = new ArrayList();
        collection.add("Màn hình");
        collection.add("Laptop");
        collection.add("Iphone");
        collection.add("Samsung");
        System.out.println(collection);
        ArrayList c1 = (ArrayList) list.clone();
        c1.addAll(collection);
        System.out.println("Kết hợp 2 kho hàng: ");
        System.out.println(c1);
        System.out.println("******************");
        c1 = (ArrayList) list.clone();
        c1.retainAll(collection);
        System.out.println("Các sản phẩm trùng lặp nhau là: ");
        System.out.println(c1);
        System.out.println("*******************");
        c1 = (ArrayList) list.clone();
        c1.removeAll(collection);
        System.out.println("Các sản phẩm không trùng lặp nhau là: ");
        System.out.println(c1);
    }
}
