import java.util.*;

public class project {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num, num1, num2;
        int n, i, x, y, z;
        int principle_amount, rate, time;
        int sum = 0, fact = 1, n1;
        int l1 = 0, l2 = 1, l3;
        System.out.println("Enter the number Negative -1 to exit the loop");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        // HERE THE CALCULTE THE +,-,*,/
        while (true) {
            if (num == -1) {
                break;
            }
            System.out.println("Enter any two number:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Additon of two number is =" + (num1 + num2));
            System.out.println("Multiplication of Two number is=" + (num1 * num2));
            System.out.println("Subtracion of Two number is=" + (num1 - num2));
            System.out.println("Division of two number is =" + (num1 / num2));
            System.out.println("Enter the number to calculated the table:");
            n = sc.nextInt();
            for (i = 1; i <= 10; i++) {
                System.out.println("Table is " + (n * i));
            }
            System.out.println("Enter the any three integr to calcualte the average:");
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println("the three number aberage is =" + (x + y + z) / 3);
            // HERE THE PRINCIPLE AMOUNT CALCULATE
            System.out.println("Enter the pricniple_amount:");
            principle_amount = sc.nextInt();
            System.out.println("Enter the rate of(%):");
            rate = sc.nextInt();
            System.out.println("Enter the time:");
            time = sc.nextInt();
            System.out.println("The simple intrest is =" + (principle_amount * rate * time) / 100);
            for (i = 1; i <= 10; i++) {
                sum = sum + i;
            }
            System.out.println("the sum of 10 number is =" + (sum));
            // HERE THE CALCULATED THE FACTORIAL

            System.out.println("Enter the number to calculated the factorail:");
            n1 = sc.nextInt();
            for (i = 1; i <= n1; i++) {
                fact = fact * i;

            }
            System.out.println("final factorail is=" + (fact));
            // HERE THE CALCUALTE FIBNACHI SERIES
            int number;
            System.out.println("Enter the number to create fibnachi series:");
            number = sc.nextInt();
            for (i = 2; i <= number; i++) {
                l3 = l1 + l2;
                l1 = l2;
                l2 = l3;
                System.out.println("The fibnachi series " + (l3));
            }
            // HERE THE REVERSE NUMBER OR NOT
            int rem, rev = 0, number2;
            System.out.println("Enter the number convert into revesr number:");
            number2 = sc.nextInt();
            while (number2 != 0) {
                rem = number2 % 10;
                rev = rev * 10 + rem;
                number2 = number2 / 10;

            }
            System.out.println("The reverse number is" + (rev));

            int rem1, rev1 = 0, number3;
            System.out.println("Enter the number check the plaidrom or not:");
            number3 = sc.nextInt();
            int x2 = number3;
            while (number3 != 0) {
                rem1 = number3 % 10;
                rev1 = rev1 * 10 + rem1;
                number3 = number3 / 10;

            }
            if (x2 == rev) {

                System.out.println("This number is palidrom number");
            } else {
                System.out.println("This number is not plaidrome number:");
            }
            // HERE CALCULATE THE ARMSTRONG NUMBER OR NOT
            int rem2, sum3 = 0, number4;
            System.out.println("Enter the number check the Armstrong or not:");
            number4 = sc.nextInt();
            int x1 = number4;
            while (number4 != 0) {
                rem2 = number2 % 10;
                sum3 = rem2 * rem2 * rem2 + sum;
                number4 = number4 / 10;

            }
            if (x1 == number4) {
                System.out.println("This is Armstrong Number:");
            } else {
                System.out.println("This is not Armstrong number:");
            }
            // HERE THE CHECK ADULT OR NOT
            int age;
            System.out.println("Enter your age check adult or not:");
            age = sc.nextInt();
            if (age >= 18) {
                System.out.println("your are adult");
            } else {
                System.out.println("not adult");
            }
            // HERE CHECK NUMBER GREATE OR NOT
            int p, q;
            System.out.println("Enter the  any two number check greter or not");
            p = sc.nextInt();
            q = sc.nextInt();
            if (p > q) {
                System.out.println("P is gerater than q");
            } else {
                System.out.println("q is grater then p");
            }
            // HERE CALUALTED THE CHECK VOWEL OR NOT
            // String ch;

            // Scanner sc1 = new Scanner(System.in);
            // System.out.println("Enter any caharcter(single) to check vowel or not");
            // ch = sc1.nextLine();
            // if (ch == "a" || ch == "e" ||ch == "i" || ch == "o" || ch == "u") {
            // System.out.println("this letter is vowel");
            // } else if (ch == "A" || ch == "E" || ch == "I" || ch == "O" || ch == "U") {
            // System.out.println("This leter is vowel");
            // } else {
            // System.out.println("This letter is not vowel:");
            // }

            // HERE THE CHECK SQUARE OR NOT
            int s;
            System.out.println("Enter the number:");
            s = sc.nextInt();
            int s2 = (s * s);
            System.out.println("How much square is");
            int s3 = sc.nextInt();
            if (s2 == s3) {
                System.out.println("you are answer is write:");
            } else {
                System.out.println("you are answer is wrong:");
            }

            // Here check two number sum how muc
            int w, w1, w2;
            System.out.println("Enter the any two number");
            w = sc.nextInt();
            w1 = sc.nextInt();
            w2 = w1 + w;
            System.out.println("sum of two number given how much:");
            int w3;
            w3 = sc.nextInt();
            if (w3 == w2) {
                System.out.println("Your answer is write");
            } else {
                System.out.println("your answer is wrong");
            }
            // here genertae the even number series
            int number5;
            System.out.println("Enter the number to generrate the even number sum");
            number5 = sc.nextInt();
            for (i = 1; i <= number5; i++) {
                System.out.println("Evevn number series is" + (2 * i));

            }
            // Here generate the odd number series
            int number6;
            System.out.println("Enter the number to generrate the odd number series");
            number6 = sc.nextInt();
            for (i = 1; i <= number6; i++) {
                System.out.println("Evevn number series is" + (2 * i - 1));

            }
            // Here generate the square number series
            int number7;
            System.out.println("Enter the number to generrate the square number series");
            number7 = sc.nextInt();
            for (i = 1; i <= number7; i++) {
                System.out.println("Evevn number series is" + (i * i));

            }

            // Here generate the cube number series
            int number8;
            System.out.println("Enter the number to generrate the cube number series");
            number7 = sc.nextInt();
            for (i = 1; i <= number7; i++) {
                System.out.println("Evevn number series is" + (i * i * i));

            }

            // Here ARRAY IMPLEMENTION
            int ma[] = new int[5];

            for (i = 0; i < 5; i++) {
                System.out.println("ENter the elemnt in array:");
                ma[i] = sc.nextInt();

            }
            for (i = 0; i < 5; i++) {
                System.out.println("The array element is" + ma[i]);
            }
            // Here ARRAY sum

            int ma1[] = new int[5];

            for (i = 0; i < 5; i++) {
                System.out.println("ENter the elemnt in array:");
                ma1[i] = sc.nextInt();

            }
            int sum_5 = 0;
            for (i = 0; i < 5; i++) {

                sum_5 = sum_5 + ma1[i];
            }
            System.out.println("Sum of Array element is " + sum_5);
        }

    }
}