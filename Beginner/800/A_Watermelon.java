package Beginner;
import java.util.*;

public class A_Watermelon {
    public static void main(String[] args) {
         
        Scanner myObj = new Scanner(System.in);
        int input = myObj.nextInt();

        boolean isDividable = checkDividable(input);
        if (isDividable) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    private static boolean checkDividable(int input) {
        if (input > 2 && input % 2 == 0) {
            return true;
        }
        return false;
    }
}

//Just need to think about Sum of two even number is even
//Two even number never sum upto and odd number
//Even number should be greater than 2 to be divided in two even numbers