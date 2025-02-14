import java.io.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int res = cal(num);
        System.out.print(res);
    
    }

    public static int cal(int n) {
        int sum = IntStream.rangeClosed(1, n).sum();
        return sum/10;
    }
}