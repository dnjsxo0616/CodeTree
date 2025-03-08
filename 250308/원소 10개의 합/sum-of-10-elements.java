import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        int plus = 0;
        for(int i=0; i<10; i++) {
            plus += arr[i];
        }

        System.out.print(plus);
    }
}