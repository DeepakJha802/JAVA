import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = armstrong(n);
        System.out.println(ans);
    }

    static boolean armstrong(int n)
    {
        int ans = n;
        int sum = 0 , rem ;
        while (n > 0)
        {
            rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        if (sum == ans)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
