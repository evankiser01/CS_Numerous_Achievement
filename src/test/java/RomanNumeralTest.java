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

}
