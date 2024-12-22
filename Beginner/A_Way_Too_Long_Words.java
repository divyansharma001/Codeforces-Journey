package Beginner;
import java.util.*;

public class A_Way_Too_Long_Words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= num; i++) {
            String input = sc.nextLine();
            replacement(input);
        }

    }

    public static void replacement(String input) {
        int length = input.length();
        if (length <= 10) {
            System.out.println(input);
        } else {
            System.out.println("" + input.charAt(0) + (length - 2) + input.charAt(length - 1));
        }

    }
}
