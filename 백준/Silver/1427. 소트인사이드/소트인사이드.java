import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s= br.readLine();
        Integer[] arr = new Integer[s.length()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(s.substring(i,i+1));
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}