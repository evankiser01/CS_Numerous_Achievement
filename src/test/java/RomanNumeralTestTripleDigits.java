import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestTripleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();
    @Test
    public void testNumber100() {
        int testDigit = 100;
        Assertions.assertEquals("C", converter.convert(testDigit));
    }
    @Test
    public void testNumber200() {
        int testDigit = 200;
        Assertions.assertEquals("CC", converter.convert(testDigit));
    }
    @Test
    public void testNumber300() {
        int testDigit = 300;
        Assertions.assertEquals("CCC", converter.convert(testDigit));
    }
    @Test
    public void testNumber400() {
        int testDigit = 400;
        Assertions.assertEquals("CD", converter.convert(testDigit));
    }
    @Test
    public void testNumber500() {
        int testDigit = 500;
        Assertions.assertEquals("D", converter.convert(testDigit));
    }
    @Test
    public void testNumber600() {
        int testDigit = 600;
        Assertions.assertEquals("DC", converter.convert(testDigit));
    }
    @Test
    public void testNumber700() {
        int testDigit = 700;
        Assertions.assertEquals("DCC", converter.convert(testDigit));
    }
    @Test
    public void testNumber800() {
        int testDigit = 800;
        Assertions.assertEquals("DCCC", converter.convert(testDigit));
    }
    @Test
    public void testNumber900() {
        int testDigit = 900;
        Assertions.assertEquals("CM", converter.convert(testDigit));
    }


}
