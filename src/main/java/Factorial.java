import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputt.txt"));
        PrintWriter writer = new PrintWriter("factorials.txt");

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int factorial = calculateFactorial(n);
            writer.printf("The factorial of %d is %d.\n", n, factorial);
        }

        scanner.close();
        writer.close();
    }

    // Method to calculate factorial of a number
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
