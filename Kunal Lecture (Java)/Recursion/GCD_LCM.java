import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two no: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("This is gcd: " + gcd(a , b));
        System.out.println("This is lcm: " + lcm(a, b));    
    }
    static int gcd (int a , int b)
    {
        if (a == 0)
        {
            return b;
        }
        return gcd(b % a, a);
    }
    static int lcm (int a, int b)
    {
        return ((a * b) / gcd(a , b));
    }
}
