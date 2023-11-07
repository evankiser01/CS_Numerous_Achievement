import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RomanNumeralTest {
    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testNumberOne() {
        int testDigit = 1;
        Assertions.assertEquals("I", converter.convert(testDigit));
    }
    @Test
    public void testNumberTwo() {
        int testDigit = 2;
        Assertions.assertEquals("II", converter.convert(testDigit));
    }
    @Test
    public void testNumberThree() {
        int testDigit = 3;
        Assertions.assertEquals("III", converter.convert(testDigit));
    }
    @Test
    public void testNumberFour() {
        int testDigit = 4;
        Assertions.assertEquals("IV", converter.convert(testDigit));
    }
    @Test
    public void testNumberFive() {
        int testDigit = 5;
        Assertions.assertEquals("V", converter.convert(testDigit));
    }
    @Test
    public void testNumberSix() {
        int testDigit = 6;
        Assertions.assertEquals("VI", converter.convert(testDigit));
    }
    @Test
    public void testNumber7() {
        int testDigit = 7;
        Assertions.assertEquals("VII", converter.convert(testDigit));
    }
    @Test
    public void testNumber8() {
        int testDigit = 8;
        Assertions.assertEquals("VIII", converter.convert(testDigit));
    }
    @Test
    public void testNumber9() {
        int testDigit = 9;
        Assertions.assertEquals("IX", converter.convert(testDigit));
    }
    @Test
    public void testNumber10() {
        int testDigit = 10;
        Assertions.assertEquals("X", converter.convert(testDigit));
    }


}
