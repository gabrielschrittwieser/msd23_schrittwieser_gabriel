package at.fhj.msd;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

/**
 * Simple Calculator that implements four basic operations: add, subtract, divide, multiply
 */
public class Calculator {
    private static final Set<String> OPERATORS = Set.of("+", "-", "*", "/");
    static Scanner scanner = new Scanner(System.in);
    static int numCount = 1;

    /**
     * Reads a non-negative double input by the user, loops until valid input is made
     * @return non-negative Double
     */
    static double readNumber() {
        while (true) {
            System.out.printf("Value %d:", numCount);
            try {
                double i = Double.parseDouble(scanner.nextLine());
                if (i >= 0) {
                    numCount++;
                    return i;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a non-negative valid double!");
            }
        }
    }

    /**
     * Cuts decimals if they only consist of zeros
     * @param d Double
     * @return Whole number or decimal number
     */
    static String doubleTrimmer(double d) {
        String num = String.valueOf(d);
        String[] parts = num.split("\\.");
        if (parts[1].matches("0+")) {
            return parts[0];
        } else {
            return num;
        }
    }

    /**
     * Reads user-input operator. Loops until valid operator is input
     * @return String corresponding to operator
     */
    static String readOperator() {
        while(true) {
            System.out.print("Operator:");
            String o = scanner.nextLine();
            if (OPERATORS.contains(o)) {
                return o;
            } else {
                System.out.println("Please enter a valid operator - allowed operators: +,-,*,/");
            }
        }
    }

    static double addNums(double num1, double num2) {
        return num1 + num2;
    }

    static double subtractNums(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplyNums(double num1, double num2) {
        return num1 * num2;
    }

    static double divideNums(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * Single usage of the calculator. Calls upon previous methods to read two numbers and an operator.
     * Executes arithmetic operation based on the input operator and prints result to the console.
     */
    static void calculator() {
        double v1 = readNumber();
        String op = readOperator();
        double v2 = readNumber();
        double result = 0;
        while (op.equals("/") && v2 == 0) {
            System.out.println("Division by zero not possible");
            numCount = 2;
            v2 = readNumber();
        }

        switch (op) {
            case "+":
                result = addNums(v1, v2);
                break;
            case "-":
                result = subtractNums(v1, v2);
                break;
            case "*":
                result = multiplyNums(v1, v2);
                break;
            case "/":
                result = divideNums(v1, v2);
                break;
        }

        System.out.printf("%s%s%s = %s", doubleTrimmer(v1), op, doubleTrimmer(v2), doubleTrimmer(result));
    }
}
