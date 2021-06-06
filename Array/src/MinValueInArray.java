public class MinValueInArray {
    public static void main(String[] args) {
        int []arr ={2,10,12,9,7,8,11,3};
        int value =minValue(arr);
        System.out.println("The smallest element in the array is: " + value);
    }
    public static int minValue(int[] array){
        int min = array[0];
        int i = 0;
        for(;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
