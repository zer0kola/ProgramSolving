import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.next();
            if (a.equals("0")) break;
            char[] chars = a.toCharArray();
            boolean flag = true;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length - i -1])
                    flag = false;
            }
            if (flag) {
                System.out.println("yes");
            } else System.out.println("no");
        }
    }
}