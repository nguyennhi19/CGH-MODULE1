package ShopPiMap;

public class Pet {
    String name;
    int age;
    String gender;
    String dateOfBirth;
    String color;
    String species;
    int price;
    int quantity;
    String status;

    public Pet(String name, int age, String gender,String dateOfBirth, String color, String species, int price, int quantity, String status){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        this.species = species;
        this.price = price;
        this.quantity = quantity;
        this.status =status;
    }

    public Pet() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        return name + "," + age + "," + gender + "," + dateOfBirth + ","
                + color + "," + species + "," + price +"," + quantity +"," + status +"\n";

    }

    public String toStringCSV() {
        return name + "," + age + "," + gender + "," + dateOfBirth
                + "," + color + "," + species + "," + price +"," + quantity +"," + status +"\n";
    }

}
