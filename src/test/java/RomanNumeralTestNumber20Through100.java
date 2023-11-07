import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestNumber20Through100 {
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

}
