import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test ; i++) {
            int revive = sc.nextInt();
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < revive; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }


    }
}
