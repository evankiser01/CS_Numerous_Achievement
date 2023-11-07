import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestDoubleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testNumber10() {
        int testDigit = 10;
        Assertions.assertEquals("X", converter.convert(testDigit));
    }
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
    @Test
    public void testNumber60() {
        int testDigit = 60;
        Assertions.assertEquals("LX", converter.convert(testDigit));
    }
    @Test
    public void testNumber70() {
        int testDigit = 70;
        Assertions.assertEquals("LXX", converter.convert(testDigit));
    }
    @Test
    public void testNumber80() {
        int testDigit = 80;
        Assertions.assertEquals("LXXX", converter.convert(testDigit));
    }
    @Test
    public void testNumber90() {
        int testDigit = 90;
        Assertions.assertEquals("XC", converter.convert(testDigit));
    }

}
