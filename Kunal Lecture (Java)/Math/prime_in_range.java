
import java.util.Scanner;

public class prime_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean[] prime = new boolean[n + 1];
        range_prime ( n , prime);
    }
    static void range_prime (int n , boolean[] prime)
    {
        for (int i = 2; n >= (i * i); i++)
        {
            if (!prime[i])
            {
                for (int j = (i * 2); j <= n; j += i)
                {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++)
        {
            if(!prime[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}

// Auxilary space complexity:- O(n).
// Time complexity:- O(n * log(log n)).
