import java.util.*;

public class Array {
    int a[] = new int[5], i;

    Scanner sc = new Scanner(System.in);

    void input_array() {
        System.out.println("Enter the aary element in 5:");

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    void Array_print() {
        for (i = 0; i < 5; i++) {
            System.out.println("Enter the array element is:" + a[i]);
        }
    }

}

class Array1 {
    public static void main(String[] args) {
        Array ob = new Array();
        ob.input_array();
        ob.Array_print();

    }
}
