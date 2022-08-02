import java.util.Scanner;

public class find_power_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exponent: ");
        int n = sc.nextInt();
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * b;
            }
            b = b * b;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}

// Complexity :- log(n).
