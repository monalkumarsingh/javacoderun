// import java.util.*;

// public class string_manipulation {
//     String ch;

//     void input_String() {
//         System.out.println("Enter the string convert in to the upper case:");
//         Scanner sc = new Scanner(System.in);
//         ch = sc.nextLine();

//     }

//     void convert_upper_case() {
//         System.out.println("Given the String convert in to the upper case:");
//         System.out.println(ch.toUpperCase());
//     }
// }

// class string_manipulation1 {
//     public static void main(String[] args) {
//         string_manipulation ob = new string_manipulation();
//         ob.input_String();
//         ob.convert_upper_case()
//     }
// }
// HERE THE STRING  CONVERT THE LOWER CASE 
// import java.util.*;

// public class string_manipulation {
//     String ch;

//     void input_String() {
//         System.out.println("Enter the string convert in to the lower case:");
//         Scanner sc = new Scanner(System.in);
//         ch = sc.nextLine();

//     }

//     void convert_lower_case() {
//         System.out.println("Given the String convert in to the Lower case:");
//         System.out.println(ch.toLowerCase());
//     }
// }

// class string_manipulation1 {
//     public static void main(String[] args) {
//         string_manipulation ob = new string_manipulation();
//         ob.input_String();
//         ob.convert_lower_case();
//     }
// }

// import java.util.*;

// public class string_manipulation {
//     String ch;

//     void input_String() {
//         System.out.println("Enter the string :");
//         Scanner sc = new Scanner(System.in);
//         ch = sc.nextLine();

//     }

//     void convert_upper_case() {
//         System.out.println("Given the String Starting letter is match then show true:");
//         System.out.println(ch.startsWith("m"));
//     }
// }

// class string_manipulation1 {
//     public static void main(String[] args) {
//         string_manipulation ob = new string_manipulation();
//         ob.input_String();
//         ob.convert_upper_case();
//     }
// }

import java.util.*;

public class string_manipulation {
    String ch;

    void input_String() {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextLine();

    }

    void convert_last_letter() {
        System.out.println("Given the last letter is match then show true:");
        System.out.println(ch.endsWith("t"));
    }
}

class string_manipulation1 {
    public static void main(String[] args) {
        string_manipulation ob = new string_manipulation();
        ob.input_String();
        ob.convert_last_letter();
    }
}
