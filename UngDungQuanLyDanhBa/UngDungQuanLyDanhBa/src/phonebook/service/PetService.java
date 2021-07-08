package phonebook.service;

import phonebook.dal.PetP;
import phonebook.model.Pet;

import java.util.Map;

public class PetService {
    PetP phoneBookDB = new PetP();

    public void add(Pet phoneBook) throws Exception{
        phoneBookDB.add(phoneBook);
    }

    public Pet find(String phone){
        return PetP.phoneBookList.get(phone);
    }

    public void updateFile() throws Exception {
        phoneBookDB.saveFile();
    }

    public boolean remove(String phone) throws Exception{
        boolean result = phoneBookDB.remove(phone);
        phoneBookDB.saveFile();
        return result;
    }

    public void printPhoneBook(){
        for (Map.Entry<String, Pet> entry : PetP.phoneBookList.entrySet()){
            System.out.println(entry.getKey()+ " | " + entry.getValue().toStringInfo());
        }
    }

    public void loadData() throws Exception{
        phoneBookDB.readFile();
    }

    public int size(){
       return PetP.phoneBookList.size();
    }
}
