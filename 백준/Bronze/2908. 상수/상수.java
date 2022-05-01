import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (reverse(a)>reverse(b)) System.out.println(reverse(a));
        else System.out.println(reverse(b));
    }
    public static int reverse(int a){
        int n1 = a%10;
        int n2 = (a%100)/10;
        int n3 = a/100;
        return n1*100+n2*10+n3;
    }

}