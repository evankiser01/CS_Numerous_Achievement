public class RomanNumeralConverter {

    StringBuilder romanNumeralHolder = new StringBuilder();
    int[] sigNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public String convert(int userDigit) {
        for( int i=0; i<sigNumbers.length; i++) {
            while ( userDigit >= sigNumbers[i]) {
                romanNumeralHolder.append(romanNumerals[i]);
                userDigit = userDigit - sigNumbers[i];
            }
        }
        return romanNumeralHolder.toString();
    }
}
