import java.util.Scanner;

public class Print_n_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_n_numbers(n);
    }
    static void print_n_numbers (int n)
    {
        if (n == 1)
        {
            System.out.print(n + " ");
            return;
        }
        print_n_numbers(n - 1);
        System.out.print(n + " ");
    }
}
