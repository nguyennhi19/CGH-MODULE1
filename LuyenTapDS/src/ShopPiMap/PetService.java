package ShopPiMap;

import java.io.IOException;
import java.util.Scanner;

public class PetService {
    PetP petP = new PetP();
    Pet pe = new Pet();
    Scanner sc = new Scanner(System.in);
    public void addPet(){
        petP.add(pe);
        try {
            petP.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void pet(){
        petP.pet();
    }
    public void edit(){
        String name = sc.nextLine();
        petP.edit(name);
        try {
            petP.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(){
        String name = sc.nextLine();
        petP.delete(name);
        try {
            petP.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void find(){
        String name = sc.nextLine();
        petP.find(name);
    }
    public void readFile(){
        try {
            petP.readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void saveFile(){
        try {
            petP.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void display(){
        petP.display();
    }
}
