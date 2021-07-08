package Dal;

import Model.DanhBa;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DanhBaDB {
    public static Map<String, DanhBa> danhBaList;

    static {
        danhBaList =  new HashMap<>();
    }

    public void saveFile() throws Exception{
        File file = new File("contacts.csv");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream("contacts.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (Map.Entry<String, DanhBa> entry : danhBaList.entrySet()){
            bos.write(entry.getValue().toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
        fos.close();
    }

    public void add(DanhBa danhBa) throws Exception{
        danhBaList.put(danhBa.getPhoneNumber(), danhBa);
    }

    public void readFile() throws Exception{
        File file = new File("contacts.csv");
        if (!file.exists()){
            return;
        }else {
            FileReader fileReader = new FileReader("contacts.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] str = line.split(",");
                DanhBa danhBa = new DanhBa(str[0],str[1],str[2],str[3],str[4],str[5],str[6]);
                add(danhBa);
            }
            bufferedReader.close();
        }
    }
    public boolean remove(String phone){
        boolean result = danhBaList.remove(phone) == null;
        return result;
    }
}
