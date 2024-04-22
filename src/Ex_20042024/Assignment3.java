package Ex_20042024;

//Post and Pre increment/decrement operator
public class Assignment3 {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(--b + b++ + ++b);
        System.out.println("Value of b is " +b);

        //Result -> Exp1 + Exp2 + Exp3
        //Exp1 -> --b -> 1st decrement so value -> 9       Value of b -> 9
        //Exp2 -> b++ -> assign the value 1st   -> 9       Value of b -> 10
        //Exp3 -> ++b -> 1st increment so value -> 11      Value of b -> 11
    }
}
