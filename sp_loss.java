import java.util.*;

public class sp_loss {
    int sp, loss;
    float cp;

    void input_loss() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling price:");
        sp = sc.nextInt();
        System.out.println("Enter the loss:");
        loss = sc.nextInt();

    }

    void calculate_cost_price() {
        loss = 100 - loss;
        cp = 100 * sp / loss;
    }

    void display_cp()

    {
        System.out.println("The loss is" + cp);
    }
}

class sp_loss1 {
    public static void main(String[] args) {
        sp_loss ob = new sp_loss();
        ob.input_loss();
        ob.calculate_cost_price();
        ob.display_cp();
    }
}
