public class Accessories {
    String name;
    int price;
    String species;
    int quantity;
    String status;

    public Accessories(){

    }

    public Accessories(String name, int price,String species, int quantity, String status){
        this.name = name;
        this.price = price;
        this.species = species;
        this.quantity = quantity;
        this.status =status;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", species='" + species + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
