import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (65 <= word.charAt(i) && word.charAt(i)<= 67) count += 3;
            else if (68 <= word.charAt(i) && word.charAt(i)<= 70) count += 4;
            else if (71 <= word.charAt(i) && word.charAt(i)<= 73) count += 5;
            else if (74 <= word.charAt(i) && word.charAt(i)<= 76) count += 6;
            else if (77 <= word.charAt(i) && word.charAt(i)<= 79) count += 7;
            else if (80 <= word.charAt(i) && word.charAt(i)<= 83) count += 8;
            else if (84 <= word.charAt(i) && word.charAt(i)<= 86) count += 9;
            else count += 10;
        }
        System.out.println(count);
    }
}