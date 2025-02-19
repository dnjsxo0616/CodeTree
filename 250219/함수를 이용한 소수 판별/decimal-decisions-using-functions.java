import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans= 0;
        for(int i=a; i<=b; i++) {
            if(calculation(i)){
                continue;
            }
            ans+=i;
            
        }
        System.out.print(ans);
    }

    public static boolean calculation(int n) {
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                return true;
            }
        }
        return false;
    }
}