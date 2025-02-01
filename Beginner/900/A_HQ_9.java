import java.util.Scanner;

public class A_HQ_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tcString = sc.nextLine();

        for (int i = 0; i < tcString.length(); i++) {
            char currentChar = tcString.charAt(i);

            if (currentChar == 'H' || currentChar == 'Q' || currentChar == '9' ) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}