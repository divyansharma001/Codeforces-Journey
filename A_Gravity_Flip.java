import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Gravity_Flip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
    
}