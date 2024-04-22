package Ex_20042024;

//Find the Maximum number between three given numbers using Ternary operator.
public class Assignment1 {
    public static void main(String[] args) {
        int num1 = 138, num2 = 98, num3 = 452;
        int max = num1 > num2? num1 : num2;
        int maxNumber = max > num3 ? max : num3;
        System.out.println(maxNumber);
    }
}
