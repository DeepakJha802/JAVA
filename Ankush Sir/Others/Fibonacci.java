
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo (int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        int smalloutput_1 = fibo(n - 1);
        int smalloutput_2 = fibo(n - 2);
        return smalloutput_1 + smalloutput_2;
    }
}

