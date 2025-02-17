import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int cont = 0;
        for(int i=num1; i<=num2; i++) {
            if(magicNum(i) || checkNum(i)) {
                cont++;
            }
        }
        System.out.print(cont);
    }

    public static boolean magicNum(int n) {
        String numStr = String.valueOf(n);
        return numStr.indexOf('3') != -1 || numStr.indexOf('6') != -1 || numStr.indexOf('9') != -1;
         
    }

    public static boolean checkNum(int n){
        return n%3==0;
    }
}