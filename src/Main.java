import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String choice;

        do {
            double num1;
            double num2;
            String op;
            System.out.println("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.println("Enter the operation(+,-,*,/)");
            op = sc.next();

            System.out.println("Enter the second number: ");
            num2 = sc.nextDouble();

            switch (op) {
                case "+":
                    System.out.println("Result"+(num1+num2));
                    break;
                case "-":
                    System.out.println("Result"+(num1-num2));
                    break;

                case "/":
                    if(num2!=0){
                        System.out.println("Result"+(num1/num2));
                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case "*":
                    System.out.println("Result"+(num1*num2));
                    break;

                case "%":
                    System.out.println("Result"+(num1%num2));
                    break;

                case "^":
                    System.out.println("Result"+Math.pow(num1,num2));
                    break;

                    default:
                    System.out.println("Invalid input");


            }
            System.out.println("Do you want to continue? yas/no");
            choice = sc.next();

        }while(choice.equalsIgnoreCase("yas"));
            System.out.println("exit");







sc.close();

    }
}