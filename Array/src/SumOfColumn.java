import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int n,m;
        int column;
        double sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the row of Array:");
        n = input.nextInt();
        System.out.println("Enter the column of Array:");
        m = input.nextInt();

        double arr[][] = new double[n][m];
        System.out.printf("Enter the element: \n");
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.printf("arr[%d][%d] = ",i,j);
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.printf("Print Array: \n");
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.printf("%.2f\t",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the column: ");
        column = input.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(column == j+1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.printf("Sum of column %d is %f ",column,sum);

    }
}
