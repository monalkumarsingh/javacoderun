import java.util.Scanner;

public class Fibnachi {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, n;
        System.out.println(num1 + " " + num2);
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        for (i = 2; i <= n; i++) {
            num3 = num1 + num2;
            num1 = num2;

            num2 = num3;
            System.out.println(num3);
        }
    }
}
