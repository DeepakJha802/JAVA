import java.util.Scanner;

public class fibonacci_no {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int ans = fibonacci(n);
       System.out.println(ans);
    }

    static int fibonacci(int n)
    {
        if (n < 2)
        {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// Print the nth fibonacci nos.
