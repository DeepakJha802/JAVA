import java.util.Scanner;

public class magic_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n = sc.nextInt();
        System.out.println("Enter The Base: ");
        int b = sc.nextInt();
        int ans = 0;
        while (n > 0)
        {
            int last = n & 1;
            n = n >> 1;
            ans += last * b;
            b = b * 5;
        }
        System.out.println(ans);
    }
}
