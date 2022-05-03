import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i<3; i++){
            arr1[i] = c%10;
            c = c/10;
        }
        for (int i = 0; i<3; i++){
            arr2[i] = arr1[i]*a;
        }
        for(int i = 0; i<3; i++){
            System.out.println(arr2[i]);
        }
        System.out.println(a*b);

    }


}