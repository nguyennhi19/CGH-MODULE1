import java.util.Scanner;

public class AddValueInArray {
    public static void main(String[] args) {
        int size;
        int arr[];
        int X;
        int index;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the size of Aray: ");
        size = input.nextInt();
        arr = new int[size];

        System.out.println("Enter the Element in Array:");
        for(int i = 0;i<arr.length;i++){
            System.out.printf("Arr[%d]",arr[i]);
            arr[i] = input.nextInt();
        }
        System.out.printf("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();

        System.out.printf("Enter the numbe X:");
        X = input.nextInt();
        System.out.printf("Enter the numbe index:");
        index = input.nextInt();

        if(index<=1 && index >=arr.length-1){
            System.out.println("X cann't replace in Array!");
        }else {
            for(int i = 0;i<arr.length-1;i++){
                if(index == i){
                    for(int j = 0;j<arr.length-i;j++){
                        arr[arr.length-1-j] =arr[arr.length-2-j];
                    }
                    arr[index] = X;
                }

            }
        }

        System.out.println("Print Array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }

    }
}
