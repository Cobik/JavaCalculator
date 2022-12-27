import converter.Converter;
import service.CheckAlphabet;
import service.Operation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----- Print expression to calculate -----");
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");

        /**
         *  check if two numbers from different albhabets
         */
        if (CheckAlphabet.errorInArguments(str)) {
            System.out.println("Error of arguments");
            System.exit(0);
        }

        //finding operator
        char operator = str[1].charAt(0);

        /**
         *  check if two numbers are Arabic alphabet,and make simple operation
         *  else means that numbers are Rome alphabet,first convert rome values to arabic and make operations,
         *  then convert result to rome Alphabet
         */
        if (CheckAlphabet.isArabic(str)) {
            int number1 = Integer.parseInt(str[0]);
            int number2 = Integer.parseInt(str[2]);

            int result = Operation.calculate(number1, number2, operator);
            System.out.println("result: " + result);
        } else {
            int number1 = Converter.romanToInteger(str[0]);
            int number2 = Converter.romanToInteger(str[2]);

            int result = Operation.calculate(number1, number2, operator);
            String answer = Converter.integerToRoman(result);
            System.out.println("result: " + answer);

        }
    }
}
