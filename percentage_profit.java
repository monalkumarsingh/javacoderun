import java.util.*;

public class percentage_profit {
    float sp, cp, profit;
    float percenatage_profit;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the cost price:");
        sp = sc.nextFloat();
        System.out.println("Enter the cost price:");
        cp = sc.nextFloat();
    }

    void calcualte_profit() {
        profit = sp - cp;
        percenatage_profit = profit / cp * 100;
    }

    void display_profit() {
        System.out.println("Profit is=  " + percenatage_profit);
    }
}

class percentage_profit1 {
    public static void main(String[] args) {
        percentage_profit ob = new percentage_profit();
        ob.input();
        ob.calcualte_profit();
        ob.display_profit();
    }
}