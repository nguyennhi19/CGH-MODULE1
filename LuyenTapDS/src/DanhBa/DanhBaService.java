package DanhBa;


import java.io.IOException;
import java.util.Scanner;

public class DanhBaService {
    DanhbaDB danhBaDB = new DanhbaDB();
    DanhBa per = new DanhBa();
    Scanner sc = new Scanner(System.in);
    public void addPerson(){
        danhBaDB.add(per);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void edit(){
        int tel = sc.nextInt();
        danhBaDB.edit(tel);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(){
        int tel = sc.nextInt();
        danhBaDB.delete(tel);
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void find(){
        int tel = sc.nextInt();
        danhBaDB.find(tel);
    }
    public void readFile(){
        try {
            danhBaDB.readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void saveFile(){
        try {
            danhBaDB.saveFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void display(){
        danhBaDB.display();
    }
}
