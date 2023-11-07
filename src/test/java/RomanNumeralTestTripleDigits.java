import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestTripleDigits {
    RomanNumeralConverter converter = new RomanNumeralConverter();
    @Test
    public void testNumber100() {
        int testDigit = 100;
        Assertions.assertEquals("C", converter.convert(testDigit));
    }


}
