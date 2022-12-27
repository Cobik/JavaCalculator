package service;

public class CheckAlphabet {

    /**
     * check if input variable is int or not by using try catch
     */
    public static boolean isInteger(String s) {
        try {
           Integer.parseInt(s);
           return true;
        } catch (NumberFormatException er) {
            return false;
        }
    }

    /**
     * check if two numbers are Arabic and return boolean value
     */
    public static boolean isArabic(String[] s) {
        return isInteger(s[0]) && isInteger(s[2]);
    }

    /**
     * check if argument is invalid and return boolean value
     */
    public static boolean errorInArguments(String[] expressionArray) {
        return (!isInteger(expressionArray[0]) && isInteger(expressionArray[2])) ||
                (isInteger(expressionArray[0]) && !isInteger(expressionArray[2]));
    }

}
