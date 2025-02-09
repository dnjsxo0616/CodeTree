import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int res = cal2(n, m);
        System.out.print(res);

    }

    static int cal(int n, int m){
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }
        while(m!=0){
            int r = n%m;
            n = m;
            m = r;
        }
        return n;
    }

    static int cal2(int n, int m) {
        return n*m / cal(n,m);
    }
}