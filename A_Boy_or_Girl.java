import java.util.*;

public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count = countDistinctCharacters(input);

        if (count % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }

     //Checking Previous Characters (details below)
    private static int countDistinctCharacters(String input) {
        int count = 0;
        int length = input.length();

        for (int i = 0; i < length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }

        return count;
    }
}

// Previous checking method:
/*
 1.Outer Loop (i):
 Picks one character at a time (input.charAt(i)).
 
 2.Inner Loop (j):
 Compares the current character (input.charAt(i)) with all characters before it (input.charAt(j) for j = 0 to j = i - 1).
 If a match is found, the character is not distinct, and the inner loop exits early.
 
 3.Distinct Check:
 If no match is found in the inner loop, isDistinct remains true, and the character is considered distinct.
The count is incremented. 
*/