package Pet.Dal;

import Pet.Model.Pet;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PetP {
    public static Map<String, Pet> petList;

    static {
        petList = new HashMap<>();
    }

    public void saveFile() throws Exception{
        File file = new File("pet.csv");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream("pet.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (Map.Entry<String, Pet> entry : petList.entrySet()){
            bos.write(entry.getValue().toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
        fos.close();
    }

    public void add(Pet pet) throws Exception{
        petList.put(pet.getName(), pet);
    }

    public void readFile() throws Exception{
        File file = new File("pet.csv");
        if (!file.exists()){
            return;
        }else {
            FileReader fileReader = new FileReader("pet.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] arr = line.split(",");
                Pet pet = new Pet(arr[0],Integer.parseInt(arr[1]),arr[2],
                        arr[3],arr[4],arr[5],Integer.parseInt(arr[6]),Integer.parseInt(arr[7]),arr[8]);
//                Pet pet = new Pet();
//                pet.setName(arr[0]);
//                pet.setAge(Integer.parseInt(arr[1]));
//                pet.setGender(arr[2]);
//                pet.setDateOfBirth(arr[3]);
//                pet.setColor(arr[4]);
//                pet.setSpecies(arr[5]);
//                pet.setPrice(Integer.parseInt(arr[6]));
//                pet.setQuantity(Integer.parseInt(arr[7]));
//                pet.setStatus(arr[8]);
                add(pet);
            }
        }
    }

    public boolean remove(String name){
        boolean result = petList.remove(name) == null;
        return result;
    }
}
