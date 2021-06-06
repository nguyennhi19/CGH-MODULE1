import java.util.Scanner;

public class NumberOfStudentsPassedTheExam {
    public static void main(String[] args) {
        int size;
        int arr[];
        int count = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the number sudent : ");
            size = input.nextInt();
            if(size>30){
                System.out.printf("Size should not exceed 30\n");
            }

        }while(size>30);
        arr = new int[size];
        for(int i=0;i<size;i++){
            do {
                System.out.printf("Enter the mark for student %d: \n", i);
                arr[i] = input.nextInt();
            }while(arr[i]>10 || arr[i]<0);
        }
        System.out.println("List of Mark: ");
        for(int i=0;i<size;i++){
            System.out.printf("%d\t",arr[i]);
            if(arr[i] >= 5 && arr[i] <=10){
                count++;
            }
        }
        System.out.printf("The number students passed is %d !",count);
    }
}
