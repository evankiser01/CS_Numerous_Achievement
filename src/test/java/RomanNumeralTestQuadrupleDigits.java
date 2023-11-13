import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestQuadrupleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();
    @Test
    public void testNumber1000() {
        int testDigit = 1000;
        Assertions.assertEquals("M", converter.convert(testDigit));
    }
    @Test
    public void testNumber2000() {
        int testDigit = 2000;
        Assertions.assertEquals("MM", converter.convert(testDigit));
    }
    @Test
    public void testNumber3000() {
        int testDigit = 3000;
        Assertions.assertEquals("MMM", converter.convert(testDigit));
    }
}
