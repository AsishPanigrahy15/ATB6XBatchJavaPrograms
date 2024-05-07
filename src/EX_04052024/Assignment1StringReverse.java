package EX_04052024;

import java.util.Scanner;

//String reverse without using inbuild function
public class Assignment1StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = 0; i < str.length(); i++)
        {
            rev = str.charAt(i) + rev;
        }
        System.out.println("Reverse word is: " +rev);

        System.out.println("===========================");

        sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String oldStr = sc.nextLine();
        char[] charArray = oldStr.toCharArray();
        System.out.println(charArray);
        String newStr = "";
        int totalLength = oldStr.length();
        for(int i = totalLength - 1; i >= 0; i--)
        {
            newStr = newStr + oldStr.charAt(i);
        }
        System.out.println("Reverse word is: " +newStr);
    }
}
