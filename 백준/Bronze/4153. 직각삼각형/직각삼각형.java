import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0)
                break;
            else{
            if (a * a + b * b == c * c)
                arr.add("right");
            else if (a * a + c * c == b * b)
                arr.add("right");
            else if (c * c + b * b == a * a )
                arr.add("right");
            else
                arr.add("wrong");
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}