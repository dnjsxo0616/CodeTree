import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        printRect(n, m);
    }

    public static void printRect(int n, int m) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}