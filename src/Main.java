import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         List<Integer> arab=new ArrayList<Integer>()
//        {{
//            for(int i=1;i<=10;i++)
//                add(i);
//        }};
//         List<String> rome=new ArrayList<String>(){{
//            add("I");
//            add("II");
//            add("III");
//            add("IV");
//            add("V");
//            add("VI");
//            add("VII");
//            add("VIII");
//            add("IX");
//            add("X");
//
//        }};
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        Converter convert = new Converter();
        CheckAlphabet alphabet = new CheckAlphabet();

        /**
         *  check if two numbers from different albhabets
         */
        if (alphabet.Error_In_Arguments(str)) {
            System.out.println("Error of arguments");
            System.exit(0);
        }

        //finding operator
        char operator = str[1].charAt(0);

        /**
         *  check if two numbers are Arabic alphabet,and make simple operation
         */
        if (alphabet.Arabic(str)) {
            int number1 = Integer.parseInt(str[0]);
            int number2 = Integer.parseInt(str[2]);

            int result = convert.calculate(number1, number2, operator);
            System.out.println("result : " + result);
        }

        /**
         *  else means that numbers are Rome alphabet,first convert rome values to arabic and make operations,
         *  then convert result to rome Alphabet
         */
        else {
            int number1 = convert.romeToInt(str[0]);
            int number2 = convert.romeToInt(str[2]);

            int result = convert.calculate(number1, number2, operator);
            String answer = convert.intToRome(result);
            System.out.println("result :" + answer);

        }

    }
}
