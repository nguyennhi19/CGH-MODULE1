import java.util.Scanner;

public class CountWordString {
    public static void main(String[] args) {
        String s = "";
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s = input.nextLine();
        System.out.printf("%s\n",s);
        for(int i  = 0;i<s.length();i++){
            if(s.charAt(i)== 'c'){
                count++;
            }
        }if(count == 0 ){
            count = -1;
        }
        System.out.printf("The number C found in String is: %d",count);
    }
}
