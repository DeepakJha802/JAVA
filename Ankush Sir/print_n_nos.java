
import java.util.Scanner;

public class print_n_nos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        number(n , 1);
    }

    static int number(int n , int i)
    {
        if (i <= n)
        {
            System.out.print(i + " ");
            return number(n , ++i);
        }
        return 1;
    }
}
