package service;

public class Operation {

    public static int calculate(int number1, int number2, char operator) {

        switch (operator) {
            case '+':
                return number1 + number2;

            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;

            case '/':

                if (number2 == 0) {
                    throw new RuntimeException("Division by zero is prohibited");
                }
                return number1 / number2;

            default:
                throw new RuntimeException("Operator is invalid");
        }
    }

}
