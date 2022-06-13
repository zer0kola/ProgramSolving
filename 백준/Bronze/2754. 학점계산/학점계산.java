import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String g =br.readLine();
        if (Objects.equals(g, "A+")) System.out.println(4.3);
        else if (Objects.equals(g, "A0")) System.out.println(4.0);
        else if (Objects.equals(g, "A-")) System.out.println(3.7);
        else if (Objects.equals(g, "B+")) System.out.println(3.3);
        else if (Objects.equals(g, "B0")) System.out.println(3.0);
        else if (Objects.equals(g, "B-")) System.out.println(2.7);
        else if (Objects.equals(g, "C+")) System.out.println(2.3);
        else if (Objects.equals(g, "C0")) System.out.println(2.0);
        else if (Objects.equals(g, "C-")) System.out.println(1.7);
        else if (Objects.equals(g, "D+")) System.out.println(1.3);
        else if (Objects.equals(g, "D0")) System.out.println(1.0);
        else if (Objects.equals(g, "D-")) System.out.println(0.7);
        else  System.out.println(0.0);
    }
}
