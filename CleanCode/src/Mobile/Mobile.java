package Mobile;

public class Mobile {
    private String name;
    private String messenger;

    public Mobile(){

    }
    public Mobile(String name, String messenger){
        this.name=name;
        this.messenger=messenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", messenger='" + messenger + '\'' +
                '}';
    }
}
