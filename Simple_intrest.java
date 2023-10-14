import java.util.*;

public class Simple_intrest {
    int time, principle_amount, rate;
    float simple_percentage;
    Scanner sc = new Scanner(System.in);

    void input_percentage() {
        System.out.println("Enter the Principle Amount:");
        principle_amount = sc.nextInt();
        System.out.println("Enter the time:");
        time = sc.nextInt();
        System.out.println("Enter the rate(intreset):");
        rate = sc.nextInt();
    }

    void calculate_percentage()

    {
        simple_percentage = (principle_amount * time * rate) / 100;
    }

    void display_percenatage() {
        System.out.println("The simple intrest is  =" + simple_percentage);
    }
}

class Simple_intrest1 {
    public static void main(String[] args) {
        Simple_intrest ob = new Simple_intrest();
        ob.input_percentage();
        ob.calculate_percentage();
        ob.display_percenatage();
    }
}