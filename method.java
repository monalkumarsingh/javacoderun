import java.util.*;

public class method {
    int sum = 0, a, b;

    void message() {
        System.out.println("Enter the any two number:");
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

    }

    void show() {
        sum = a + b;
        System.out.println("The sum of two number:" + (sum));
        System.out.println("The mul of two number:" + (a * b));
        System.out.println("The sub of two number:" + (a - b));
        System.out.println("The Divison of two number:" + (a / b));
        System.out.println("The sum of two number:" + (a % b));

    }
}

class method1 {
    public static void main(String[] args) {
        method ob = new method();
        ob.message();
        ob.input();
        ob.show();
    }
}
