public class method1_overloading {
    private static void Display(int a) {
        System.out.println("Go to integer data:" + a);
    }

    private static void Display(String b) {
        System.out.println("Go to String data:" + b);
    }

    public static void main(String[] args) {
        Display(10);
        Display("monal singh");
    }

}
