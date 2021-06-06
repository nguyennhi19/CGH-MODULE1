import java.util.Scanner;

public class MaxElementTwoDimensionalArray {
    public static void main(String[] args) {
        int size;
        int index=0;
        int k=0;
        int n,m;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the size of row:");
        n = input.nextInt();
        System.out.printf("Enter the size of column:");
        m = input.nextInt();
        double arr[][] = new double[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.printf("arr[%d][%d] = ",i,j);
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.printf("Print the Array: ");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.printf("%.2f\t",arr[i][j]);
            }
        }
        double max = arr[0][0];
        System.out.println();
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    index = i;
                    k = j;
                }
            }
        }
        System.out.printf("The largest element in Array is %.2f at %d and %d",max,index,k);


    }
}
