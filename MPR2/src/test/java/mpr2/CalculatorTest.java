package mpr2;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void baseOf2RaisedTo3Equals8(){
        int expected = 8;
        int result = Calculator.power(2, 3);
        assertEquals(expected, result);
    }

    @Test
    public void baseOf2RaisedTo4Equals16(){
        int expected = 16;
        int result = Calculator.power(2, 4);
        assertEquals(expected, result);
    }

    @Test
    public void baseOfMinus2RaisedTo3EqualsMinus8(){
        int expected = -8;
        int result = Calculator.power(-2, 3);
        assertEquals(expected, result);
    }

    @Test
    public void GCFOf18And27Is9(){
        int expected = 9;
        int result = Calculator.GCF(18, 27);
        assertEquals(expected, result);
    }

    @Test
    public void GCFOf10And5Is5(){
        int expected = 5;
        int result = Calculator.GCF(10, 5);
        assertEquals(expected, result);
    }

    @Test
    public void TwoDividesEight(){
        boolean expected = true;
        boolean result = Calculator.isDivisibleBySecondNumber(8, 2);
        assertEquals(expected, result);
    }

    @Test
    public void TenDividesEighty(){
        boolean expected = true;
        boolean result = Calculator.isDivisibleBySecondNumber(80, 10);
        assertEquals(expected, result);
    }
}
