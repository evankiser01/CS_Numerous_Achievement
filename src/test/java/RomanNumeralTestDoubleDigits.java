import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestDoubleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testNumber20() {
        int testDigit = 20;
        Assertions.assertEquals("XX", converter.convert(testDigit));
    }
    @Test
    public void testNumber30() {
        int testDigit = 30;
        Assertions.assertEquals("XXX", converter.convert(testDigit));
    }
    @Test
    public void testNumber40() {
        int testDigit = 40;
        Assertions.assertEquals("XL", converter.convert(testDigit));
    }
    @Test
    public void testNumber50() {
        int testDigit = 50;
        Assertions.assertEquals("L", converter.convert(testDigit));
    }

}
