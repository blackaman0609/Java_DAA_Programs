// 2. Develope a prog to evaluate of power func and determine that the complexity should be O(logn)

import java.util.Scanner;

public class Power_func {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / power(base, -exponent);
        } else {
            int temp = power(base, exponent / 2);
            if (exponent % 2 == 0) {
                return temp * temp;
            } else {
                return base * temp * temp;
            }
        }
    }
}
