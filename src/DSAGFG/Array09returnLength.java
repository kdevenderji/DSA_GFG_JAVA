package DSAGFG;
import java.util.Scanner;

public class Array09returnLength {
    public static int arrayLength(int[] numbers) {
        return numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();

            }
            System.out.println(arrayLength(numbers));
        }
sc.close();
    }
}