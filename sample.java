import java.util.Scanner;

public class Fibo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int count = scanner.nextInt();
        
        System.out.println("Fibonacci series:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int i) {
        // if Fibonacci series does not start with 0
        if (i <= 1) {
            return 1;
        }

        // if Fibonacci series starts with 0
        // if (i <= 1) {
        //     return i;
        // }

        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}
