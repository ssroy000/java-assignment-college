import java.util.Scanner;

public class FactorialMethod {

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        long fact = factorial(value);
        System.out.println("Factorial of " + value + " is " + fact);

        sc.close();
    }
}
