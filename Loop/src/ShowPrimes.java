package src;

public class ShowPrimes {
    public static void main(String[] args) {
        int num =2;
        int count =0;
        while (num<100){
            int check =0;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    check++;
                }
            }if(check==0){
                System.out.println(num);
                count++;
            }num++;
        }
    }
}
