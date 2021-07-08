package Service;

import Dal.DanhBaDB;
import Model.DanhBa;

import java.util.Map;

public class DanhBaService {
    DanhBaDB danhBaDB = new DanhBaDB();

    public void add(DanhBa danhBa) throws Exception{
        danhBaDB.add(danhBa);
    }

    public DanhBa find(String phone){
        return DanhBaDB.danhBaList.get(phone);
    }

    public void updateFile() throws Exception{
        danhBaDB.saveFile();
    }

    public boolean remove(String phone) throws  Exception{
        boolean result = danhBaDB.remove(phone);
        danhBaDB.saveFile();;
        return result;
    }
    public void print(){
        for (Map.Entry<String,DanhBa> entry : DanhBaDB.danhBaList.entrySet()){
            System.out.println(entry.getKey()+ " | " + entry.getValue().toStringInfo());
        }
    }

    public void loadData() throws Exception{
        danhBaDB.readFile();
    }

    public int size(){
        return danhBaDB.danhBaList.size();
    }
}

