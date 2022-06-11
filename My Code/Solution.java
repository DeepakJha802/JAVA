
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0)
        {
            long n = sc.nextLong();
            System.out.println(n+" can be fitted in:");
            for (int i = 0; i < 4; i++)
            {
                if (x >= -128 && x <= 127)
                System.out.println("* byte");
                else if (x >= -32768 && x <= 32767)
                System.out.println("* short");
                else if (x >= -2147483648 && x <= 2147483647)
                System.out.println("* int");
                else if (x >=  && x <= 9223372036854775807)
                System.out.println("* long");
                else
                System.out.println(n+ "can't be fitted anywhere.");
            }
        }
    }
}
