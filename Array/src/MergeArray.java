import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int a[];
        int b[];
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the size of Array a amd b:");
        size = input.nextInt();

        a = new int[size];
        b = new int[size];

        System.out.println("Enter the Element in Array a:");
        for(int i = 0;i<a.length;i++){
            System.out.printf("a[%d]= ",i);
            a[i] = input.nextInt();
        }

        System.out.println("Enter the Element in Array b:");
        for(int i = 0;i<b.length;i++){
            System.out.printf("b[%d]= ",i);
            b[i] = input.nextInt();
        }

        int c[] = new int[size+size];

        for(int i = 0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int i = a.length;i<c.length;i++){
            c[i] = b[i - b.length];
        }
        System.out.printf("Print Array c: ");
        for(int i = 0;i<c.length;i++){
            System.out.printf("%d\t",c[i]);
        }
    }
}
