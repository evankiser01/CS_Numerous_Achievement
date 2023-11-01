public class RomanNumeralConverter {

    StringBuilder romanNumeralHolder = new StringBuilder();
    int[] sigNumbers = {1};
    String[] romanNumerals = {"I"};
    public String convert(int userDigit) {
        for( int i=0; i<sigNumbers.length; i++) {
            while ( userDigit >= sigNumbers[i]) {
                romanNumeralHolder.append(romanNumerals[i]);
                userDigit =- sigNumbers[i];
            }
        }
        return romanNumeralHolder.toString();
    }
}
