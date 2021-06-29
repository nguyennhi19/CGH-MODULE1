package Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println();
    }


    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int lastOperand = 1;
        char Operand = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, lastOperand, Operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int lastOperand = 1;
        char Operand = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, lastOperand, Operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand = 2;
        int lastOperand = 2;
        char Operand = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, lastOperand, Operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperand = 6;
        int lastOperand = 3;
        char Operand = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, lastOperand, Operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int lastOperand = 0;
        char Operand = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, lastOperand, Operand);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int lastOperand = 0;
        char Operand = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, lastOperand, Operand);});
    }
}