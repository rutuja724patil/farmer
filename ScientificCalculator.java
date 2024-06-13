import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice;
        
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sine");
        System.out.println("6. Cosine");
        System.out.println("7. Tangent");
        System.out.println("8. Inverse Sine");
        System.out.println("9. Inverse Cosine");
        System.out.println("10. Inverse Tangent");
        System.out.println("11. Logarithm (base 10)");
        System.out.println("12. Natural Logarithm");
        System.out.println("13. Exponentiation");
        System.out.println("14. Square Root");
        System.out.println("15. Cube Root");
        System.out.println("16. Nth Root");
        System.out.println("17. Factorial");
        System.out.println("18. Permutation");
        System.out.println("19. Combination");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            case 5:
                result = Math.sin(num1);
                System.out.println("Result: " + result);
                break;
            case 6:
                result = Math.cos(num1);
                System.out.println("Result: " + result);
                break;
            case 7:
                result = Math.tan(num1);
                System.out.println("Result: " + result);
                break;
            case 8:
                result = Math.asin(num1);
                System.out.println("Result: " + result);
                break;
            case 9:
                result = Math.acos(num1);
                System.out.println("Result: " + result);
                break;
            case 10:
                result = Math.atan(num1);
                System.out.println("Result: " + result);
                break;
            case 11:
                result = Math.log10(num1);
                System.out.println("Result: " + result);
                break;
            case 12:
                result = Math.log(num1);
                System.out.println("Result: " + result);
                break;
            case 13:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 14:
                result = Math.sqrt(num1);
                System.out.println("Result: " + result);
                break;
            case 15:
                result = Math.cbrt(num1);
                System.out.println("Result: " + result);
                break;
            case 16:
                System.out.print("Enter root degree: ");
                double degree = scanner.nextDouble();
        }
    }
}

   