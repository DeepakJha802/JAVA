import java.util.Scanner;

public class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int x = n;

            for (int j = i; j >= 1; j--)
            {
                System.out.print(x + " ");
                x--;
            }

            x++;

            for (int j = (2 * (n - i)); j >= 1; j--)
            {
                System.out.print(x + " ");
            }

            x++;

            for (int j = (i - 1); j >= 1; j--)
            {
                System.out.print(x + " ");
                x++;
            }

            System.out.println();
        }

        for (int i = (n - 1); i >= 1; i--)
        {
            int x = n;

            for (int j = i; j >= 1; j--)
            {
                System.out.print(x + " ");
                x--;
            }

            x++;

            for (int j = (2 * (n - i)); j >= 1; j--)
            {
                System.out.print(x + " ");
            }

            x++;

            for (int j = (i - 1); j >= 1; j--)
            {
                System.out.print(x + " ");
                x++;
            }

            System.out.println();
        }
    }
}

/*

1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2

 */
