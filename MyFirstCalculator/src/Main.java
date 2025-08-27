import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter operation (+, -, *, /):");
            char op = sc.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            switch (op) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division sby zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            System.out.println("Do you want to continue? (yes/no): ");
            choice = sc.next(); // بيسمح للمستخدم يقرر يكمل أو يوقف

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Calculator closed.");
    }
}
