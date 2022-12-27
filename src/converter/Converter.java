package converter;

import constants.RomanNumbers;
import java.util.Map;
import java.util.TreeMap;

public class Converter {

    public static int romanToInteger(String romanNumber) {
        int result = 0;
        Map<Character, Integer> romanNumbersMap = RomanNumbers.ROMAN_NUMBERS_BY_NUMERAL;

        for (int i = 0; i < romanNumber.length(); i++) {
            char ch = romanNumber.charAt(i);

            if( i > 0 && romanNumbersMap.get(ch) > romanNumbersMap.get(romanNumber.charAt(i-1))) {
                result += romanNumbersMap.get(ch) - 2 * romanNumbersMap.get(romanNumber.charAt(i-1));
            } else {
                result += romanNumbersMap.get(ch);
            }
        }
        return result;
    }

    public static String integerToRoman(int number) {
        TreeMap<Integer, String> romanNumbersMap = (TreeMap<Integer, String>) RomanNumbers.NUMERAL_NUMBERS_BY_ROMAN;
        int value = romanNumbersMap.floorKey(number);
        if ( number == value ) {
            return romanNumbersMap.get(number);
        }
        return romanNumbersMap.get(value) + integerToRoman(number - value);
    }

}
