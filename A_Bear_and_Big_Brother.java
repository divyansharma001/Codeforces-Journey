import java.util.Scanner;

public class A_Bear_and_Big_Brother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wL = sc.nextInt();
        int wB = sc.nextInt();
        int count = 0;

        while(wL<=wB){
            wL = 3*wL;
            wB = 2*wB;
            count++;
        }

        System.out.println(count);
        
        sc.close();
    }
}