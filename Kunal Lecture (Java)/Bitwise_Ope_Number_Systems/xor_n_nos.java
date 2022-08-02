import java.util.Scanner;

public class xor_n_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int ans = 0;
        if (n % 4 == 0)
        {
            ans = n;
        }
        else if (n % 4 == 1)
        {
            ans = 1;
        }
        else if (n % 4 == 2)
        {
            ans = n + 1;
        }
        else if (n % 4 == 3)
        {
            ans = 0;
        }
        System.out.println(ans);
    }
}

// Q. we have to find the xor of numbers from 0 to n.

// when n = 0 , xor = 0
// when n = 1, (0 ^ 1) = 1.  here, (n % 4 == 1) and ans = 1.
// when n = 2, (0 ^ 1 ^ 2) = 3.  here, (n % 4 == 2) and ans = 3(n + 1).
// when n = 3, (0 ^ 1 ^ 2 ^ 3) = 0. here, (n % 4 == 3) and ans = 0.
// when n = 4, (0 ^ 1 ^ 2 ^ 3 ^ 4) = 4. here , (n % 4 == 0) and ans = 4(n).
