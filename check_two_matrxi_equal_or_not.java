import java.util.*;

public class check_two_matrxi_equal_or_not {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int i, j;
    Scanner sc = new Scanner(System.in);

    void input_matrix_first() {
        System.out.println("Enter the elemnet matrix in  a[2][2]:");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void input_matrix_second() {
        System.out.println("Enter the elemnet matrix in  b[2][2]:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void check_matrix_equal_or_not() {
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if (a[i][j] == b[i][j]) {
                    System.out.println("Both Matrix are   equala[2][2]==b[2][2]:");

                } else {
                    System.out.println("Both matrix are  not equala[2][2]!=b[2][2]:");
                }
            }
        }
    }
}

class check_two_matrxi_equal_or_not1 {
    public static void main(String[] args) {
        check_two_matrxi_equal_or_not ob = new check_two_matrxi_equal_or_not();
        ob.input_matrix_first();
        ob.input_matrix_second();
        ob.check_matrix_equal_or_not();
    }

}
