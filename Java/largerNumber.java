import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result;

        if (number1 > number2) {
            result = number1;
        } else if (number2 > number1) {
            result = number2;
        } else {
            System.out.println("Both numbers are equal.");
            return;
        }

        System.out.println("The larger number is: " + result);

        scanner.close();
    }
}
