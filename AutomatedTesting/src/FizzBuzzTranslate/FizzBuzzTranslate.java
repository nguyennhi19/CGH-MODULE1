package FizzBuzzTranslate;

public class FizzBuzzTranslate {


    public String translate(int a) {
        String strA =  " ";


        if (a % 3 == 0 && a % 5 == 0) {
            return "FizzBuzz";
        } else if (a % 5 == 0 || a % 10 == 5 || a / 10 == 5) {
            return "Buzz";
        } else if (a % 3 == 0  || a % 10 == 3 || a / 10 == 3) {
            return "Fizz";
        } else return strA;
    }

    private static final String[] tens = {
            "","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
    };

    private static final String[] ones = {
            ""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine","ten","eleven",
            "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
    };
    private static String ReadNumberToString(int number) {
        String result;
        if (number == 0) { return "zero";}
        if (number % 100 < 20) {
            result = ones[number % 100];
            number /= 100;
        } else {
            result = ones[number % 10];
            number /= 10;

            result = tens[number % 10] + result;
            number /= 10;
        }
        if (number == 0) return result;
        return ones[number] + " hundred " + result;
    }

}
