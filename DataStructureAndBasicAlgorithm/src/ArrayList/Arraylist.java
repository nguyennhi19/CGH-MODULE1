package ArrayList;

import java.util.ArrayList;
import java.util.List;

class  Product {
    String name;


    public Product(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "" +this.name;
    }
}

public class Arraylist {
    public static void main(String[] args) {
        Product p1 = new Product("N");
        Product p2 = new Product("Ni");
        Product p3 = new Product("Nii");
        List<Product> arrayList = new ArrayList<>();

        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("");


        System.out.println("Mảng ban đầu là: "+arrayList);

//        arrayList.add(1,6);
        System.out.println("Mảng sau khi thêm phần tử:"+arrayList);

        arrayList.remove(p2);

        System.out.println("Mảng sau khi xóa: "+arrayList);

//        arrayList.remove(4);
    }
}
