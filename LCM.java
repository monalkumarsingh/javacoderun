import java.util.*;

public class LCM {
    int a, b, lcm;

    void input() {
        System.out.println("Enter any two number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void check_condition()

    {
        if (a > b) {
            lcm = a;

        } else {
            lcm = b;
        }
    }

    void lcm_calculate() {

        for (lcm = 1; lcm <= a * b; lcm++) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
        }
    }

    void display_lcm() {
        System.out.println("Lcm is " + lcm);
    }
}

class LCM1 {
    public static void main(String[] args) {

        LCM ob = new LCM();
        ob.input();
        ob.check_condition();
        ob.lcm_calculate();
        ob.display_lcm();
    }
}
