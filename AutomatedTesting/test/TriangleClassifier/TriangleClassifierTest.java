package TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void showResult() {
        int a=2;
        int b=2;
        int c=2;
        String expected="tam giác đều";

        String result=TriangleClassifier.showResult(a,b,c);
        assertEquals(expected,result);
    }
}