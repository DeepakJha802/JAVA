import java.util.Scanner;

public class number_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = digit(n , 0);
        System.out.println(ans);
    }

    static int digit(int n , int i)
    {

        if (n == 0)
        {
            return (i);
        }
        else
        {
            return digit(n / 10 , ++i);
        }
   }
}
