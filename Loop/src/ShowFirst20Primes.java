package src;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N =2;
        while (count<numbers){
            int check = 0;
            for(int i=2;i<N;i++){
                if(N%i==0){
                    check++;
                }
            }if(check==0){
                System.out.println(N);
                count++;
            }N++;
        }
    }
}
