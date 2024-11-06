package Code_Work;

import java.util.Scanner;

public class IncrementalLargeInteger {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        return new int[n + 1];
    }

    public static void main(String[] args) {
        System.out.print("Enter number length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for(int i=0;i<length;i++){
            numbers[i] = sc.nextInt();
        }
        int[] result = plusOne(numbers);
        for (int number : result) {
            System.out.print("Output: " + number);
        }
    }
}
