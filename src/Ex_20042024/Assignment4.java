package Ex_20042024;

//Cube Root example
public class Assignment4 {
    public static void main(String[] args) {
        double x = 10, y = 12.4, z = 56.78;
        double result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);
    }
}
