import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        plus(a, b, c);
    }

    public static void plus(int a, int b, int c){
        if(a < b || a<c) {
            System.out.print(a);
        } else if ( b < a || b<c) {
            System.out.print(b);
        } else{
            System.out.print(c);
        }
    }
}