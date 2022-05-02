import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] arr = new String[test];
        for (int i = 0; i < test; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int o = sc.nextInt();
            int x = (o-1)/h + 1;
            int y = o%h==0 ? h : o%h;
            String sY = Integer.toString(y);
            String sX = Integer.toString(x);

            if (x<10){
                arr[i] = sY + '0' + sX;
            }else{
                arr[i] =  sY + sX;
            }
        }
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}