package Pet.Service;

import Pet.Dal.PetP;
import Pet.Model.Pet;

import java.util.Map;

public class PetService {
    PetP petP = new PetP();

    public void add(Pet pet) throws Exception{
        petP.add(pet);
    }

    public Pet find(String name){
        return PetP.petList.get(name);
    }

    public void updateFile() throws Exception {
        petP.saveFile();
    }

    public boolean remove(String name) throws Exception{
        boolean result = petP.remove(name);
        petP.saveFile();
        return result;
    }

    public void print(){
        for (Map.Entry<String,Pet> entry : PetP.petList.entrySet()){
            System.out.println(entry.getKey()+ " | " + entry.getValue().toStringInfo());
        }
    }

    public void loadData() throws Exception{
        petP.readFile();
    }

    public int size(){
        return petP.petList.size();
    }
}
