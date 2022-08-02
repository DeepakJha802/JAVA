import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // for (int i = 2; i < n; i++)
        // {
        //     if (n % i == 0)
        //     {
        //         System.out.println("Not Prime");
        //         break;
        //     }
        //     else if (i == (n - 1))
        //     {
        //         System.out.println("Prime");
        //     }
        // }

        System.out.println(prime(n));
    }
    static boolean prime(int n)
    {
        if (n == 2)
        {
            return true;
        }
        int c = 2;
        while ((c * c) <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
}
