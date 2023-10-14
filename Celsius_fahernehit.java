import java.util.*;

public class Celsius_fahernehit {
    float c, f;
    Scanner sc = new Scanner(System.in);

    void input_celsius() {
        System.out.println("Enter the number in to the celsisus:");
        c = sc.nextFloat();

    }

    void celsius_calualtion() {
        f = (float) (1.8 * c + 32);
        System.out.println("the fahernehit is:" + f);
    }
}

class Celsius_fahernehit1 {
    public static void main(String[] args) {

        Celsius_fahernehit ob = new Celsius_fahernehit();
        ob.input_celsius();
        ob.celsius_calualtion();

    }

}