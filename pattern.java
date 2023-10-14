import java.util.*;

public class pattern {
    int i, j, n;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number ");
        n = sc.nextInt();
    }

    // HERE TRANGULAR STAR PATTERN
    void trangular_pattern() {
        System.out.println("Here the Draw the traingular pattern:");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // HERE HELLO SQAURE PATTERN
    void hello_square_pattern() {
        System.out.println("Here Draw the Hello square pattern:");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || j == n)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    // HERE L shape aptternn programming

    void L_pattern() {
        System.out.println("Here Draw the L shape Pattern program:");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == 1 || i == n)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    void U_pattern() {
        System.out.println("Here Draw the L shape Pattern program:");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == 1 || i == n || j == n)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("  ");
        }
    }

    // HERE REVERSE TRANGULAR STAR PATTERN
    void _Reverse_trangular_pattern() {
        System.out.println("Here the Draw the Reverse traingular pattern:");
        for (i = n; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // // HERE N SHAPE STAR PATTERN
    // void N_Shape_pattern() {
    //     System.out.println("Here the Draw the Reverse traingular pattern:");
    //     for (i = i; i <= n; i++) {
    //         for (j = i; j <= n; j++) {
    //             if (j == 1 || i == j || j == n)
    //                 System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

}

class pattern1 {
    public static void main(String[] args) {
        pattern ob = new pattern();
        ob.input();
        ob.trangular_pattern();
        ob.hello_square_pattern();
        ob.L_pattern();
        ob.U_pattern();
        ob._Reverse_trangular_pattern();
        // ob.N_Shape_pattern();
    }
}