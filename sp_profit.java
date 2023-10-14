import java.util.*;

public class sp_profit {
    int sp, profit, cp;

    void input_sp_profit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling price:");
        sp = sc.nextInt();
        System.out.println("Enter the profit :");
        profit = sc.nextInt();
    }

    void calualte_cost_price() {
        profit = 100 + profit;
        cp = 100 * sp / profit;
    }

    void display_cost_price() {
        System.out.println("The final cost price is= " + cp);
    }
}

class sp_profit1 {
    public static void main(String[] args) {
        sp_profit ob = new sp_profit();
        ob.input_sp_profit();
        ob.calualte_cost_price();
        ob.display_cost_price();
    }
}
