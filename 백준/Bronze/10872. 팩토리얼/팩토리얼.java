import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        if (num>1){
            return num * factorial(num-1);
        }else{
            return 1;
        }
    }

}
