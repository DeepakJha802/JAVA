import java.util.Scanner;

public class Largest_basic {
    public static void main(String[] args) {

        // Find the larget no among three.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
        Type - 1

        int max = a;
        if (b > max)
        {
            max = b;
        }
        if (c > b)
        {
            max = c;
        }
        System.out.println("Max = " + max);
        */

        /*
        Type - 2

        int max  = 0;
        if (a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        System.out.println("Max = " + max);
        */

        // Type - 3

        // int max = Math.max(c , Math.max(a , b));
           System.out.println("Max = " + Math.max(c , Math.max(a , b)));

        // int max = Math.max(a , b);
        // int maxm = Math.max(max , c);
        // System.out.println("Max = " + maxm);

        // Type - 4

        // System.out.println(Math.max(54 , 30)); // This is compile time initialization
    }
}
