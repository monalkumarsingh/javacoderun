public class method_overloading {

    void add(double d, double e) {
        System.out.println(d + e);
    }

    void add(float a, float b) {
        System.out.println(a + b);
    }
}

class method_overloading1 {
    public static void main(String[] args) {
        method_overloading ob = new method_overloading();
        ob.add(10, 20);
        ob.add(20.5, 30.5);
    }
}

// void add(double d) {
// System.out.println(d);
// }

// void add(float a) {
// System.out.println(a);
// }
// }

// class method_overloading1 {
// public static void main(String[] args) {
// method_overloading ob = new method_overloading();
// ob.add(10);
// ob.add(1.55);
// }
// }
