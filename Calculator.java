import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        double result;
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if(num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero!");
                    sc.close();
                    return;
                }
                break;
            default: 
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
        return;
    }
}

