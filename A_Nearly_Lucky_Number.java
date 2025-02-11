import java.util.Scanner;

public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int count = 0;
        while (number>0) {
            long lastNum = number%10;
            if(lastNum==4 || lastNum==7){
                count++;
            }
            number = number/10;
        }

        if(count==4 || count==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}