import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestQuadrupleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();
    @Test
    public void testNumber1000() {
        int testDigit = 1000;
        Assertions.assertEquals("M", converter.convert(testDigit));
    }
}
