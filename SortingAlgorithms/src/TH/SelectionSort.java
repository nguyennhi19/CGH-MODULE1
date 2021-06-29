package VD;

import java.awt.*;

public class SelectionSort {
    static int[] list = {1, 9, 4, -4, 6, 5, -6};
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + ", ");

        System.out.println();
    }

    static void printArraySwap(int arr[]) {
        int n = arr.length;
        System.out.println("Swap: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    public static void selectionSort(int[] list) {
        int count=0;
        for (int i = 0; i < list.length - 1; i++) {

            /* Find the minimum in the list[i..list.length-1] */
            int currentMin = list[i];

            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                if(i == 0) {
                    System.out.println("current Value: " + list[j]);
                }
            }

            count++;

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            printArraySwap(list);
        }


        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: " );
        printArray(list);
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(+list[i] + " ");
    }
}
