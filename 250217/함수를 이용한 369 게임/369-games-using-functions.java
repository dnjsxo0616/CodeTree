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
            int n1 = i/10;
            int n2 = i%10;
            if(magicNum(n1) || magicNum(n2)|| checkNum(i)) {
                cont++;
            }
        }
        System.out.print(cont);
    }

    public static boolean magicNum(int n) {
        List<Integer> numbers = Arrays.asList(3, 6, 9);
        return numbers.contains(n);
    }

    public static boolean checkNum(int n){
        return n%3==0;
    }
}