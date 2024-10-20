import java.io.*;
import java.util.Scanner;
public class Assignment_1_BasicCalculator {
    public static void main(String args[]) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /, %):");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
            default:
                System.out.println("Invalid operator entered.");
                return;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
