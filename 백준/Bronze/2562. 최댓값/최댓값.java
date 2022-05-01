import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        int count = 0;
        int num = 0;
        for (int index:arr) {
            count++;
            if(index > max){
                max = index;
                num = count;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
