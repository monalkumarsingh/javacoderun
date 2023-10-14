import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        int num, rem, sum = 0;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not Armstrong number:");
        }
    }
}
