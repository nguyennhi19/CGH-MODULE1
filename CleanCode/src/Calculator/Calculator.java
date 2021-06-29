package Calculator;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int lastOperand, char operand) {
        switch (operand) {
            case ADDITION:
                return firstOperand + lastOperand;
            case SUBTRACTION:
                return firstOperand - lastOperand;
            case MULTIPLICATION:
                return firstOperand * lastOperand;
            case DIVISION:
                if (lastOperand != 0)
                    return firstOperand / lastOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
