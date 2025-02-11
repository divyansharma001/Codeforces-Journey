import java.util.Scanner;

public class A_Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int uppercase = 0;
        int lowercase = 0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
                uppercase++;
            }else{
                lowercase++;
            }
        }

        if(lowercase>=uppercase){
            System.out.println(input.toLowerCase());
        }else{
            System.out.println(input.toUpperCase());
        }
    }
}