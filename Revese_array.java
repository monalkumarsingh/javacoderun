import java.util.*;

public class Revese_array {
    int a[] = new int[5];
    int i;

    void input_array() {
        System.out.println("Enter the element(5) in to the array:");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    void reverse_element_array() {
        System.out.println("Revese number in array element:");
        for (i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

class Revese_array1 {
    public static void main(String[] args) {
        Revese_array ob = new Revese_array();
        ob.input_array();
        ob.reverse_element_array();
    }
}
