import java.util.Scanner;


public class power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(x , n));
    }

    static int pow (int x , int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int ans = x * pow(x , n - 1);
        return ans;
    }

}
