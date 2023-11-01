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


}
