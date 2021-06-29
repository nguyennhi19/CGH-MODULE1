package ReserveStack;

import java.util.Arrays;
import java.util.Stack;

public class ReserveStack {
    public static int[] ReserveNumberUseStack(int[] ar){
        Stack<Integer> stack = new Stack<>();
        for (int value : ar) {
            stack.push(value);
        }
        for(int i = 0; i < ar.length; i++){
            ar[i] = stack.pop();
        }
        return ar;
    }

    public static String ReserveStringUseStack(String str){
        Stack<Character> wStack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            wStack.push(str.charAt(i));
        }
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i++){

            c[i] = wStack.pop();
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        String demo = sb.toString();
        return demo;
    }

    public static void main(String [] args){
        int[] ar = {1,2,3,4,5};
        String str = "Code Gym Hue!";
//        System.out.println(Arrays.toString(ReserveStack.ReserveNumberUseStack(ar)));
        System.out.println(Arrays.toString(ReserveStack.ReserveNumberUseStack(ar)));
        System.out.print(ReserveStack.ReserveStringUseStack(str));
    }
}
