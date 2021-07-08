package BT1;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String company;
    private int price;
    private String otherDescription;

    public Product(){

    }

    public Product(int id,String name, String company, int price, String otherDescription){
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return   id + "," + name +","+ company + ","+ price + "," + otherDescription;
    }
}
