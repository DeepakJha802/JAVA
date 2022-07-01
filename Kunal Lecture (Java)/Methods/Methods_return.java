import java.util.Scanner;
public class Methods_return
{

    public static void main(String[] args)
    {
        int ans = Sum();
        System.out.println(ans);
    }

    static int Sum()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no : ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd no : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;

        return sum;
    }

}
