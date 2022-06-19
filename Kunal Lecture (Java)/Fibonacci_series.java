import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 , b = 1 , sum = 0;
        System.out.print("0 1");
        for (int i = 2; i < n; i++)
        {
            sum = sum + (a + b);
            System.out.print(sum);
            b = sum;
            sum = 
        }
    }

}
