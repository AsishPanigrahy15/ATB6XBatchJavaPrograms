package Ex_13042024;

/// Special variable whose value can't be modified during the program execution.
/// Constant is also called as final variable.

public class Lab013 {
    public static void main(String[] args) {
        final int A = 99;
        final String str = "TTA";
        final double d1 = 9999.99;

        // int A =100; //final can't be modified
        // String str = "TTAP"; //final can't be modified
        // double d1 = 1000.20; //final can't be modified
        System.out.println(A);
        System.out.println(str);
        System.out.println(d1);
    }
}
