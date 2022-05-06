import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        for (int i=0;i< alpha.length;i++) {
            alpha[i] = -1;
        }
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i]=='a') {
                if(alpha[0] == -1)
                alpha[0] = i;
            }
            else if (chars[i] =='b') {
                if(alpha[1] == -1)
                    alpha[1] = i;
            }
            else if (chars[i] =='c') {
                if(alpha[2] == -1)
                    alpha[2] = i;
            }
            else if (chars[i] =='d') {
                if(alpha[3] == -1)
                    alpha[3] = i;
            }
            else if (chars[i] =='e') {
                if(alpha[4] == -1)
                    alpha[4] = i;
            }
            else if (chars[i] =='f') {
                if(alpha[5] == -1)
                    alpha[5] = i;
            }
            else if (chars[i] =='g') {
                if(alpha[6] == -1)
                    alpha[6] = i;
            }
            else if (chars[i] =='h') {
                if(alpha[7] == -1)
                    alpha[7] = i;
            }
            else if (chars[i] =='i') {
                if(alpha[8] == -1)
                    alpha[8] = i;
            }
            else if (chars[i] =='j') {
                if(alpha[9] == -1)
                    alpha[9] = i;
            }
            else if (chars[i] =='k') {
                if(alpha[10] == -1)
                    alpha[10] = i;
            }
            else if (chars[i] =='l') {
                if(alpha[11] == -1)
                    alpha[11] = i;
            }
            else if (chars[i] =='m') {
                if(alpha[12] == -1)
                    alpha[12] = i;
            }
            else if (chars[i] =='n') {
                if(alpha[13] == -1)
                    alpha[13] = i;
            }
            else if (chars[i] =='o') {
                if(alpha[14] == -1)
                    alpha[14] = i;
            }
            else if (chars[i] =='p') {
                if(alpha[15] == -1)
                    alpha[15] = i;
            }
            else if (chars[i] =='q') {
                if(alpha[16] == -1)
                    alpha[16] = i;
            }
            else if (chars[i] =='r') {
                if(alpha[17] == -1)
                    alpha[17] = i;
            }
            else if (chars[i] =='s'){
                if(alpha[18] == -1)
                    alpha[18] = i;
            }
            else if (chars[i] =='t') {
                if(alpha[19] == -1)
                    alpha[19] = i;
            }
            else if (chars[i] =='u') {
                if(alpha[20] == -1)
                    alpha[20] = i;
            }
            else if (chars[i] =='v'){
                if(alpha[21] == -1)
                    alpha[21] = i;
            }
            else if (chars[i] =='w') {
                if(alpha[22] == -1)
                    alpha[22] = i;
            }
            else if (chars[i] =='x') {
                if(alpha[23] == -1)
                    alpha[23] = i;
            }
            else if (chars[i] =='y') {
                if(alpha[24] == -1)
                    alpha[24] = i;
            }
            else if (chars[i] =='z') {
                if(alpha[25] == -1)
                    alpha[25] = i;
            }
        }
        for (int i = 0; i < alpha.length ; i++) {
            System.out.print(alpha[i]);
            System.out.print(' ');
        }
    }

}
