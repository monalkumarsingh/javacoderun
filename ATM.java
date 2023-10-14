import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int amount = 100000, widthdarw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automata Teller Machine:");
            System.out.println("Choose 1 for Wiithdraw:");
            System.out.println("Choose 2 for Deposit:");
            System.out.println("Choose 3 for check balance:");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform:");

            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money widthdraw:");
                    widthdarw = sc.nextInt();
                    if (amount >= widthdarw) {
                        amount = amount - widthdarw;
                        System.out.println("Please collect your money:");
                    } else {
                        System.out.println("Insufficent Amount");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposit:");
                    deposit = sc.nextInt();
                    amount = amount + deposit;
                    System.out.println("Your Money has been Succes fullly despsit");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance" + amount);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
