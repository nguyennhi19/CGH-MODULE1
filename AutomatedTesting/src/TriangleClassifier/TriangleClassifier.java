package TriangleClassifier;

public class TriangleClassifier {
    public static String showResult(int a, int b, int c){
        if(a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
                return "tam giác vuông";
            }else if(a==b && b==c){
                return "tam giác đều";
            }else if(a==b || a==c || b==c){
                return "tam giác cân";
            }else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b){
                return "tam giác tù";
            }else return "tam giác nhọn";
        }else return "không phải làm tam giác";



    }
}
