import java.util.*;

public class chec_add_mul_sub_div_ {
    int a, b, a1, b1, a2, b2, a3, a4, a5, a6, a7;
    Scanner sc = new Scanner(System.in);

    void input_add() {
        System.out.println("Enter the any two number:");
        a = sc.nextInt();
        b = sc.nextInt();
        a3 = a + b;
    }

    // HERE THE CHECCK THE ADDTION TWO NUMBER TRUE OR NOT
    void check_add() {
        System.out.println("Enter the Givne two number sum is how much:");
        int b4;
        b4 = sc.nextInt();
        if (b4 == a3) {
            System.out.println("your answer is write:");
        } else {
            System.out.println("your answer is wrong:");

        }

    }

    void input_sub() {
        System.out.println("Enter the any two number:");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a4 = a1 - b1;
    }

    // HERE THE CHECCK THE SUBTRACTION TWO NUMBER TRUE OR NOT
    void check_sub() {
        System.out.println("Enter the Givne two number sub is how much:");
        int b5;
        b5 = sc.nextInt();
        if (b5 == a4) {
            System.out.println("your answer is write:");
        } else {
            System.out.println("your answer is wrong:");

        }

    }

    void input_mul() {
        System.out.println("Enter the any two number:");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        a5 = a2 * b2;
    }

    // HERE THE CHECCK THE MULTIPLICATION TWO NUMBER TRUE OR NOT
    void check_MUL() {
        System.out.println("Enter the Givne two number mul is how much:");
        int b6;
        b6 = sc.nextInt();
        if (b6 == a5) {
            System.out.println("your answer is write:");
        } else {
            System.out.println("your answer is wrong:");

        }

    }

    void input_div() {
        System.out.println("Enter the any two number:");
        a7 = sc.nextInt();
        b2 = sc.nextInt();
        a6 = a2 / b2;
    }

    // // HERE THE CHECCK THE DIVISION TWO NUMBER TRUE OR NOT
    void check_div() {
        System.out.println("Enter the Givne two number Divison is how much:");
        int b7;
        b7 = sc.nextInt();
        if (b7 == a6) {
            System.out.println("your answer is write:");
        } else {
            System.out.println("your answer is wrong:");

        }

    }

}

class Monal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        chec_add_mul_sub_div_ ob = new chec_add_mul_sub_div_();
        ob.input_add();
        ob.check_add();
        ob.input_sub();
        ob.check_sub();
        ob.input_mul();
        ob.check_MUL();
        ob.input_div();
        ob.check_div();

    }
}
