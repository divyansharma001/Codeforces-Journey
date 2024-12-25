
import java.util.*;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxNum = sc.nextLong();
        long target = sc.nextLong();

        long maxOdd = (maxNum + 1) / 2;

        if (target <= maxOdd) {
         System.out.println(2*target-1);
        }else{
            System.out.println(2*(target-maxOdd));
        }
    }

}

// this is an unoptimised approach as using an arraylist as an extra space also
// using two traversal of O(n)

// public class A_Even_Odds {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int maxNum = sc.nextInt();
// int location = sc.nextInt();

// ArrayList<Integer> list = new ArrayList<>();

// for(int i=1;i<=maxNum;i++){
// if(i%2 != 0){
// list.add(i);
// }
// }

// for(int i=1;i<=maxNum;i++){
// if(i%2 == 0){
// list.add(i);
// }
// }

// System.out.println(list.get(location-1));
// }

// }

// BigInt vs LongInt in java :
// https://www.geeksforgeeks.org/difference-between-long-and-biginteger-in-java/
