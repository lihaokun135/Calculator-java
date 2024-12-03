
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to use the simple Calculator");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the first number");
            int i = scanner.nextInt();
            System.out.print("Please select an operation");
            System.out.print(" 1:plus 2:minus 3:times 4:divide by");
            int j = scanner.nextInt();
            System.out.print("Please enter the second number");
            int z = scanner.nextInt();
            while (j == 4 && z == 0) {
                System.out.print("The divisor cannot be zero. Please re-enter the second number");
                z = scanner.nextInt();
            }
            int result = 0;
            int r = 0;            
            switch (j) {
                case 1 -> result = i + z;
                case 2 -> result = i - z;
                case 3 -> result = i * z;
                case 4 -> {
                    result = i / z;
                    r = i % z;
                }
                default -> {
                }
            }
            if( r > 0) {
                System.out.println("The result equal:"+ result +",remainder:" + r);
            }else {
                System.out.println("The result equal:" + result);
            }
        }
    }
}