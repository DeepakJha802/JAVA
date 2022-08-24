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
// To print the fibbonacci no by using recursion is very bad algorithm.
// Beacuse the time complexity is : O(2^n); which is exponential.
// Exponential time complexity is very bad.
// Space complexity of fibbonacci no. using recursion is :- O(n).
