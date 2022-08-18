import java.util.Scanner;



public class No_digit_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(no_digit (n));
    }
    static int no_digit (int n)
    {
        if (n == 0)
        {
            return 0;
        }
        int ans = no_digit(n / 10);
        return ans + 1;
    }

}
