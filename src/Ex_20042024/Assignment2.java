package Ex_20042024;

//Post and Pre increment operator
public class Assignment2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println("Value of a is " +a);

        //Result -> Exp1 + Exp2 + Exp3
        //Exp1 -> ++a -> 1st increment so value -> 11       Value of a -> 11
        //Exp2 -> a++ -> assign the value 1st   -> 11       Value of a -> 12
        //Exp3 -> a++ -> assign the value 1st   -> 12       Value of a -> 13
    }
}
