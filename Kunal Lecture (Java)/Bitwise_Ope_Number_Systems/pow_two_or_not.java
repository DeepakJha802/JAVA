import java.util.Scanner;

public class pow_two_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0)
        {
            int a = n & 1;
            if (a == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        if (count == 1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
