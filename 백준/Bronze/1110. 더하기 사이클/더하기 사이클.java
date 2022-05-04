import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin = sc.nextInt();
        int count = 1;
        int newnum = cal(origin);
        while (true) {
            if (newnum == origin) break;
            newnum = cal(newnum);
            count++;
        }
        System.out.println(count);
    }

    public static int cal(int origin) {
        int result;
        if (origin < 10) result = origin * 10 + origin;
        else result = ((origin % 10) * 10 + (origin / 10 + origin % 10) % 10);
        return result;
    }

}
