import java.util.Scanner;

public class SumOfPrincipalDiagonal {
    public static void main(String[] args) {
        int size;
        int sumOfPrincipalDiagonal = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the size of Matrix:");
        size = input.nextInt();
        int matrix[][] = new int[size][size];
        System.out.println("Enter the element in Matrix:");
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.printf("matrix[%d][%d] = ",i,j);
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.printf("Matrix: \n");
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){

                System.out.printf("| %d |",matrix[i][j]);

            }
            System.out.println();
        }
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){
                if(i==j){
                    sumOfPrincipalDiagonal+=matrix[i][j];
                }

            }
        }
        System.out.printf("Sum of the Principal Diagonal is : %d!",sumOfPrincipalDiagonal);


    }
}
