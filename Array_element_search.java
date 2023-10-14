import java.util.*;

public class Array_element_search {
    int a[] = new int[5];
    int item, i;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    void input_array() {
        System.out.println("Enter the five element in to the array:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }

    void array_elemnet_search() {
        System.out.println("Enter the item whose item is search in array:");
        item = sc.nextInt();
        for (i = 0; i < 5; i++) {
            if (a[i] == item) {
                count++;
            }
        }
    }

    void found_item() {
        if (count > 0) {
            System.out.println("Item is founded:");
        } else {
            System.out.println("Item is not founded:");
        }
    }

}

class Array_element_search1 {
    public static void main(String[] args) {
        Array_element_search ob = new Array_element_search();
        ob.input_array();
        ob.array_elemnet_search();
        ob.found_item();
    }
}
