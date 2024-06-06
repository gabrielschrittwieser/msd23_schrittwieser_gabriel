package at.fhj.msd;

import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple Calculator that implements four basic operations: add, subtract, divide, multiply
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger();
    private static final Set<String> OPERATORS = Set.of("+", "-", "*", "/", "!");
    static Scanner scanner = new Scanner(System.in);
    static int numCount = 1;

    /**
     * Reads a non-negative double input by the user, loops until valid input is made
     *
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
     *
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
     * Valid operators are: +,-,*,/,!
     *
     * @return String corresponding to operator
     */
    static String readOperator() {
        while (true) {
            System.out.print("Operator:");
            String o = scanner.nextLine();
            if (OPERATORS.contains(o)) {
                return o;
            } else {
                System.out.println("Please enter a valid operator - allowed operators: +,-,*,/,!");
            }
        }
    }

    /**
     * Takes two numbers and adds them together
     *
     * @param num1 First number
     * @param num2 Second Number
     * @return Sum of the two numbers
     */
    static double addNums(double num1, double num2) {
        logger.debug("Parameters: {} + {}", num1, num2);
        return num1 + num2;
    }

    /**
     * Takes two numbers and subtracts the second number from the first number
     *
     * @param num1 First number
     * @param num2 Second Number
     * @return Difference of second number subtracted from the first
     */
    static double subtractNums(double num1, double num2) {
        logger.debug("Parameters: {} - {}", num1, num2);
        return num1 - num2;
    }

    /**
     * Takes two numbers and multiplies them
     *
     * @param num1 First number
     * @param num2 Second Number
     * @return Product of both numbers
     */
    static double multiplyNums(double num1, double num2) {
        logger.debug("Parameters: {} * {}", num1, num2);
        return num1 * num2;
    }

    /**
     * Takes two numbers and divides the first number by the second number
     *
     * @param num1 First number
     * @param num2 Second Number
     * @return Division of both numbers
     * @throws ArithmeticException if Division by zero is attempted
     */
    static double divideNums(double num1, double num2) {
        logger.debug("Parameters: {} / {}", num1, num2);
        if (num2 == 0) {
            logger.error("Division by zero!");
            throw new ArithmeticException("Division by zero not possible");
        }
        return num1 / num2;
    }

    /**
     * Takes a number and calculates its factorial
     *
     * @param num Any integer
     * @return Factorial of given integer
     */
    static double factorial(int num) {
        if (num < 0)
            return 0;
        if (num == 1 || num == 0)
            return 1;
        return (num * factorial(num - 1));
    }

    /**
     * Single usage of the calculator. Calls upon previous methods to read two numbers and an operator.
     * Executes arithmetic operation based on the input operator and prints result to the console.
     */
    static void calculator() {
        double v1 = readNumber();
        int v3 = 0;
        double v2 = 0;
        String op = readOperator();

        if (op.equals("!")) {
            v3 = (int) v1;
        } else {
            v2 = readNumber();
        }

        double result = 0;

        switch (op) {
            case "!":
                result = factorial(v3);
                break;
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
                while (true) {
                    try {
                        result = divideNums(v1, v2);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        numCount--;
                        v2 = readNumber();
                    }
                }
        }
        if (!op.equals("!")) {
            System.out.printf("%s%s%s = %s", doubleTrimmer(v1), op, doubleTrimmer(v2), doubleTrimmer(result));
        } else {
            System.out.printf("Factorial of %d: %s", v3, doubleTrimmer(result));
        }
    }
}
