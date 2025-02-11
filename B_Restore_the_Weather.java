import java.util.*;

public class B_Restore_the_Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] originalArray = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                originalArray[i] = a[i]; 
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            Map<Integer, Queue<Integer>> tempMap = new HashMap<>();

            int j = 0;
            for (int i = 0; i < n; i++) {
                while (j < n && Math.abs(a[i] - b[j]) <= k) {
                    tempMap.computeIfAbsent(a[i], key -> new LinkedList<>()).offer(b[j]);
                    j++;
                }
            }

            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = tempMap.get(originalArray[i]).poll();
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
