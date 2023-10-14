import java.util.*;

public class profit_hone_change {
    float loss, proift;
    float cp, sp;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the selling price:");
        sp = sc.nextFloat();
        System.out.println("Enter the loss:");
        loss = sc.nextFloat();

    }

    void calculate_cp() {
        loss = 100 - loss;
        cp = (100 / loss) * sp;

    }

    void display_cp() {
        System.out.println("THe cost price is: " + cp);
    }

    void profit() {
        System.out.println("Enter the profit:");
        proift = sc.nextInt();
        proift = 100 + proift;

    }

    void profit_calcualte() {
        sp = (proift / 100 * cp);
        System.out.println(sp);
    }
}

class profit_hone_change1 {
    public static void main(String[] args) {
        profit_hone_change ob = new profit_hone_change();
        ob.input();
        ob.calculate_cp();
        ob.display_cp();
        ob.profit();
        ob.profit_calcualte();
    }
}
