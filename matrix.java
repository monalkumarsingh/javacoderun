import java.util.*;

public class matrix {

    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];
    int i, j;
    int a1[][] = new int[2][2];
    int b1[][] = new int[2][2];
    int c1[][] = new int[2][2];

    int a2[][] = new int[2][2];
    int b2[][] = new int[2][2];
    int c2[][] = new int[2][2];

    int a3[][] = new int[2][2];
    int b3[][] = new int[2][2];
    int c3[][] = new int[2][2];

    int a4[][] = new int[2][2];
    int b4[][] = new int[2][2];
    int c4[][] = new int[2][2];

    void input_matrix() {
        System.out.println("Enter the element in the first matri a[2][2]:");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix b[2][2]");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }

        }

    }

    void sum_matrix() {
        System.out.println("Sum of two matrix is c[i][j]=a[i][j]+b[i][j]:");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];

                System.out.print(" " + c[i][j]);
            }
            System.out.println(" ");

        }

    }

    void matrix1_display() {
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

    // HERE MATRIX IS SUBTRACTION PERFORM
    void input_matrix1() {
        System.out.println("Enter the element in the first matri a1[2][2]:");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                a1[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix b1[2][2]");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                b1[i][j] = sc.nextInt();
            }
        }

    }

    // HERE THE SUBTRACTION PERFORM
    void sub_matrix1() {
        System.out.println("Sbtraction  of two matrix is c[i][j]=a[i][j]-b[i][j]:");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];

                System.out.print(" " + c[i][j]);
            }
            System.out.println(" ");

        }

    }

    // HERE THE MATRIX DISPLAY
    void matrix1_display1() {
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + b1[i][j]);
            }
            System.out.println();
        }
    }

    // HERE THE MATRIX TAKE INPUT FROM THE USER
    void input_matrix2() {
        System.out.println("Enter the element in the first matri a2[2][2]:");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                a2[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix b[2][2]");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                b2[i][j] = sc.nextInt();
            }

        }

    }

    // HERE THE MATRIX PERFOM MULTIPLICATION
    void mul_matrix2() {
        System.out.println("Multiplication of two matrix is c[i][j]=a[i][j]*b[i][j]:");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                c2[i][j] += a2[i][j] * b2[i][j];

                System.out.print(" " + c2[i][j]);
            }
            System.out.println(" ");

        }

    }

    // HERE THE MATRIX DISPLAY
    void matrix1_display2() {
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a2[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + b2[i][j]);
            }
            System.out.println();
        }
    }
    // HERE THE TRANSPOSE MATRIX :
    // HERE THE TAKE INPUT a3[2][2],b3[2]b[2]

    void input_matrix3() {
        System.out.println("Enter the element in the first matri a3[2][2]:");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                a3[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix b3[2][2]");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                b3[i][j] = sc.nextInt();
            }

        }

    }

    // HERE THE NORMAL MATRIX DISPLAY
    void matrix1_display3() {
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a3[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + b3[i][j]);
            }
            System.out.println();
        }
    }

    // HERE THE TRANSPOSE MATRIX DISPLAY
    void matrix1_display4() {

        System.out.println("Transpose Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a3[j][i]);
            }
            System.out.println();
        }

        System.out.println(" Transpose Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + b3[j][i]);
            }
            System.out.println();
        }
    }

    // HERE THE UPPER TRAIGULAR MATRIX
    void input_matrix4() {
        System.out.println("Enter the element in the first matri a[2][2]:");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {

                a4[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix b[2][2]");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                b4[i][j] = sc.nextInt();
            }

        }

    }

    // HERE THE NORMAL MATRIX DISPLAY
    void matrix1_display5() {
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + a4[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(" " + b4[i][j]);
            }
            System.out.println();
        }
    }

    // HERE UPPER AND LOWER TRAINGULAR MATRIX;
    void matrix1_display6() {
        System.out.println("Upper Traingular Matrix 1 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                if (j > i) {// upper tranigular matrix
                    System.out.print("0");
                } else {
                    System.out.print(a4[i][j] + " ");
                }
                System.out.println();
            }

        }

        System.out.println("Lower Traingular Matrix 2 is :");
        for (i = 0; i < 2; i++) {

            for (j = 0; j < 2; j++) {
                if (j < i) {// lower traingular matrix
                    System.out.print("0");
                } else {
                    System.out.print(b4[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

}

class matrix1 {
    public static void main(String[] args) {
        matrix ob = new matrix();
        ob.input_matrix();
        ob.matrix1_display();
        ob.sum_matrix();
        ob.input_matrix1();
        ob.matrix1_display1();
        ob.sub_matrix1();
        ob.input_matrix2();
        ob.matrix1_display2();
        ob.mul_matrix2();
        ob.input_matrix3();
        ob.matrix1_display3();
        ob.matrix1_display4();
        ob.input_matrix4();
        ob.matrix1_display5();
        ob.matrix1_display6();
        // ob.sum_display_matrix();
    }
}