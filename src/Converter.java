import java.util.ArrayList;
import java.util.List;


public class Converter {


    public int calculate(int number1, int number2, char operator) {


        switch (operator) {
            case '+':
                return number1 + number2;

            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;

            case '/':

                if (number2 == 0) {
                    System.out.println("Division by zero is prohibited");
                    return -1;
                }
                return number1 / number2;

            default:
                System.out.println("Operator is invalid");
                return -1;
        }
    }

    public int romeToInt(String romeValue) {
        int intValue = 0;
        int last = 0;
        ArrayList romeList = new ArrayList();
        for (int i = 0; i <= 1000; i++) {
            romeList.add(i, "0");
        }
        romeList.set(1, "I");
        romeList.set(10, "X");
        romeList.set(100, "C");
        romeList.set(1000, "M");
        romeList.set(5, "V");
        romeList.set(50, "L");
        romeList.set(500, "D");

        for (int i = romeValue.length(); i > 0; i--) {
            String category = romeValue.substring(i - 1, i);
            int lastValue = romeList.indexOf(category);

            if (lastValue >= last) {
                intValue += lastValue;
            } else {
                intValue -= lastValue;
            }
            last = lastValue;
        }

        return intValue;
    }

//Convert Integer to Rome value

    public String intToRome(int value) {
        String result = "";
        while (value > 0) {
            if ((value / 1000) >= 1) {
                result = result + "M";
                value = value - 1000;
            } else if ((value / 500) >= 1) {
                result = result + "D";
                value = value - 500;
            } else if ((value / 100) >= 1) {
                result = result + "C";
                value = value - 100;
            } else if ((value / 50) >= 1) {
                result = result + "L";
                value = value - 50;
            } else if ((value / 10) >= 1) {
                result = result + "X";
                value = value - 10;
            } else if ((value / 1) >= 1) {
                switch ((value / 1)) {
                    case 9:
                        result = result + "IX";
                        value = value - 9;
                        break;
                    case 8:
                        result = result + "VIII";
                        value = value - 8;
                        break;
                    case 7:
                        result = result + "VII";
                        value = value - 7;
                        break;
                    case 6:
                        result = result + "VI";
                        value = value - 6;
                        break;
                    case 5:
                        result = result + "V";
                        value = value - 5;
                        break;
                    case 4:
                        result = result + "IV";
                        value = value - 4;
                        break;
                    case 3:
                        result = result + "III";
                        value = value - 3;
                        break;
                    case 2:
                        result = result + "II";
                        value = value - 2;
                        break;
                    case 1:
                        result = result + "I";
                        value = value - 1;
                        break;
                }
            }
        }
        return result;
    }


}
