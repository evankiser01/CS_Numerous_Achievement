import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RomanNumeralTest {
    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testNumberOne() {
        int testDigit = 1;
        Assertions.assertEquals("I", converter.convert(testDigit));
    }
}
