import java.util.Scanner;

public class square_root_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int p = 2;
        // System.out.println(square_root(n , p));

        System.out.printf("%.3f",square_root(n, p));   // this is called pretty printing.
    }
    static double square_root (int n , int p)
    {
        int s = 0;
        int e = n;

        double root = 0.0;
        while (s <= e)
        {
            int m = s + (e - s) / 2;
            if (m * m == n)
            {
                return m;
            }
            if (m * m > n)
            {
                e = m - 1;
            }
            else
            {
                s = m + 1;
            }
            double incr = 0.1;
            for (int i = 0; i < p; i++)
            {
                while (root * root <= n)
                {
                    root += incr;
                }
                root -= incr;
                incr /= 10;
            }
            return root;
        }
        return -1;
    }
}
