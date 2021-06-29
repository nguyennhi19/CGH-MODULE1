package PhoneOfNhi;
public class Iphone {
    public static void main(String[] args) {
        PhoneOfNhi Iphone =new PhoneOfNhi("Iphone4","iphone","black",256);
        nhi(Iphone);
        Iphone.setColor("white");
        nhi(Iphone);
    }

    public static void nhi (PhoneOfNhi Iphone){
        System.out.println(Iphone.getName());
        System.out.println(Iphone.getModel());
        System.out.println(Iphone.getColor());
        System.out.println(Iphone.getMemory());
    }
}
