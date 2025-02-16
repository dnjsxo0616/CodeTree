import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        print(n);
    }

    public static void print(int num) {
        int a = num/10;
        int b = num%10;
        int c = a+b;

        if(num%2==0 && c%5==0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}