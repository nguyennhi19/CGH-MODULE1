package src;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        isPrint(12);

    }
    public static void isPrint(int le){
        int[] months = new int[le];
        for (int i = 0; i < months.length; i++) {
            months[i] = i;
            System.out.println("Month " + (i + 1));
        }
    }
}
