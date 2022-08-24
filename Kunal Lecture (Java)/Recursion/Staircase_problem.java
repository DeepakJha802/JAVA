import java.util.Scanner;

public class Staircase_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(no_of_Step(n));
    }
    static int no_of_Step(int n)
    {
        if (n < 0)
        {
            return 0;
        }
        if (n == 0)
        {
            return 1;
        }
        return no_of_Step(n - 1) + no_of_Step(n - 2) + no_of_Step(n - 3);
    }
}
