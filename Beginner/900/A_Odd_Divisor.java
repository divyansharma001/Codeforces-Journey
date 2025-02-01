import java.util.Scanner;

public class A_Odd_Divisor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totNum = sc.nextInt();
        
        for(int i=0;i<totNum;i++){
           long num = sc.nextLong();
           
           if(isPowerOfTwo(num)){
            System.out.println("NO");
           }else{
            System.out.println("YES");
           }  
        }
    }

    private static boolean isPowerOfTwo(long num){
       if(num<=0){
        return false;
       }
       return (num&(num-1))==0;
    }
    
}