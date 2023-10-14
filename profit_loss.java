import java.util.*;

public class profit_loss {
    // here cp stands for cost price and sp stands for selling perice
    float cp, sp, profit, loss;
    Scanner sc = new Scanner(System.in);

    void input_cp_sp() {
        System.out.println("Enter the cost price:");
        cp = sc.nextFloat();
        System.out.println("Enter the selling price:");
        sp = sc.nextFloat();

    }

    void check_profit_loss() {
        if (sp > cp) {
            System.out.println("Profit:");
            profit = sp - cp;
            profit = profit / cp * 100;
        }

        else {
            System.out.println("Loss");
            loss = cp - sp;
            loss = loss / cp * 100;
        }
    }

    void print_profit() {
        System.out.println("The profit is((%):" + profit);
    }

    void loss() {
        System.out.println("The loss is(%):" + loss);
    }
}

class profit_loss1 {
    public static void main(String[] args) {
        profit_loss ob = new profit_loss();
        ob.input_cp_sp();
        ob.check_profit_loss();
        ob.print_profit();
        ob.loss();
    }
}
