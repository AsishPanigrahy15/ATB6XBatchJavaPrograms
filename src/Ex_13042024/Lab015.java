package Ex_13042024;

public class Lab015 {
    public static void main(String[] args) {
        System.out.print("Hi"); // Will not add the next line
        System.out.println("Hello"); //Will add the next line

        // %d  -> any integer - byte, short, int and long
        // %s  -> string
        // %c  -> char
        // %f  -> float

        byte age1 = 123;
        short age2 = 65;
        int age3 = 98;
        long age4 = 75L;

        System.out.printf("Asish age is %d", age1);

        System.out.println();
        //Phone Number
        long phone_number = 9876543210L;
        long phone_number1 = 9876543211L;

        System.out.println("Phone Number is " +phone_number);

        float pi = 3.14f;
        float pi1 = 2.54f;

        System.out.println(pi1);

        double d = 1.123456789;

    }
}
