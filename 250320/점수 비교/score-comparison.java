import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mathA = Integer.parseInt(st.nextToken());
        int engA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int mathB = Integer.parseInt(st.nextToken());
        int engB = Integer.parseInt(st.nextToken());

        if(mathA > mathB && engA > engB) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}