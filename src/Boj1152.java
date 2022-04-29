import java.util.Scanner;

public class Boj1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        if(input.charAt(0) != ' ' && input.charAt(input.length()-1) != ' '){
            count = count + 1;
        }
        if(input.charAt(0) == ' ' && input.charAt(input.length()-1) == ' '){
            count = count - 1;
        }
        System.out.println(count);
    }
}
