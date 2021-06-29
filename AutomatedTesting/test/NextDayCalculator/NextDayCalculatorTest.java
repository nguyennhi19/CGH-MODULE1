package NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void showNextDay() {
        int day=31;
        int month=12;
        int year=2019;
        String expected="1/1/2020";

        String result=NextDayCalculator.showNextDay(day,month,year);
        assertEquals(expected, result);


    }


}