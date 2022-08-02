import java.util.Scanner;

public class xor_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int ans = xor(n) ^ xor(a - 1);
        System.out.println(ans);
    }
    static int xor (int n)
    {
        if (n % 4 == 0)
        {
            return n;
        }
        else if (n % 4 == 1)
        {
            return 1;
        }
        else if (n % 4 == 2)
        {
            return n + 1;
        }
        else if (n % 4 == 3)
        {
            return 0;
        }
        return 0;
    }
}
