import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int size;
        int arr[];
        int X;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the size of Array: ");
        size = input.nextInt();
        arr = new int[size];
        System.out.println("Enter the element of Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the Element arr[%d]", i);
            arr[i] = input.nextInt();
        }

        System.out.printf("Print the Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        System.out.printf("Enter the X:");
        X = input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == X){
                count++;
            }
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = i ; j < size-1; j++) {
                if (arr[j]== X) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (count==0) {
            System.out.printf("%d not found in Array", X);
        } else {

            for (int i = 0; i < count; i++) {
                arr[arr.length-1-i]=0;
            }
        }
        System.out.printf("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
