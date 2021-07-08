package Product;

public class Product {
    private String name;
    private int price;
    private String ration;
    private int quantity;

    public Product(){

    }

    public Product(String name,int price, String ration, int quantity){
        this.name = name;
        this.price = price;
        this.ration = ration;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ration='" + ration + '\'' +
                ", quantity=" + quantity +
                '}';
    }


}
