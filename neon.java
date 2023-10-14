import java.util.*;

public class neon {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number to check");
        n = sc.nextInt();
        int square = n * n;
        while (square != 0)

        {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;

        }
        if (sum == n) {
            System.out.println(n + "is neon number");
        } else {
            System.out.println(n + "is not neon number:");
        }

    }
}
