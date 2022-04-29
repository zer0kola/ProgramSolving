import java.util.Scanner;

public class Boj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j =num; j>i+1; j--){
                System.out.print(' ');
            }for (int k = 0; k <= i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
