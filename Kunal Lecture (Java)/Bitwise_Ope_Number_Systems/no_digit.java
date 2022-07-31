import java.util.Scanner;
import java.math.*;
public class no_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}

// Complexity is: log(n).
