import java.util.Scanner;

public class Methods_sum {
    public static void main(String[] args) {

        sum();
    }

    static void sum ()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("sum = "+sum);
    }
}
