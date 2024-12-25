import java.util.*;

public class A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        boolean dangerous = isDangerous(pattern);

        if (dangerous) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isDangerous(String pattern) {
        int n = pattern.length();
        int count = 1;
        ;
        for (int i = 1; i < n; i++) {
            if (pattern.charAt(i) == pattern.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count >= 7) {
                return true;
            }
        }

        return false;
    }
}
