import java.util.Scanner;

public class no_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0)
        {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);
    }
}

// Complexity :- log(n).
