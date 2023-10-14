import java.util.*;

class square_not {
    int number, numbers1;
    Scanner Sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number :");
        number = Sc.nextInt();
        numbers1 = number * number;

    }

    void check_square_or_not() {
        System.out.println("Enter the Given number How much square:");
        int number2;
        number2 = Sc.nextInt();
        if (number2 == numbers1) {
            System.out.println("your answer is write:");
        } else {
            System.out.println("your answer is wrong:");
        }
    }

}

class A {
    public static void main(String[] args) {
        square_not ob = new square_not();
        ob.input();
        ob.check_square_or_not();
    }
}