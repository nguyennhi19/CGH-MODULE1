package PhoneOfNhi;
public class PhoneOfNhi {
     private  String name;
     private String model;
     private String color;
     private int memory;

     public PhoneOfNhi(){
     }

     public PhoneOfNhi(String name,String model,String color,int memory){
         super();
         this.name=name;
         this.model=model;
         this.color=color;
         this.memory=memory;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
     }
     public  String getModel(){
         return model;
     }
     public void setModel(String model){
         this.model=model;
     }
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public  int getMemory(){
        return memory;
    }
    public void setMemory(int memory){
        this.memory=memory;
    }

}
