import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 , b = 1;
        // System.out.print(a+" "+b+" ");
        for (int i = 1; i < n; i++)
        {
            int sum = b;
            b = b + a;
            a = sum;
        }
        System.out.print(b+" ");
    }
}
