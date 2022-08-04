import java.util.ArrayList;
import java.util.Scanner;

public class factors_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++)
        // {
        //     if (n % i == 0)
        //     {
        //         System.out.print(i + " ");
        //     }
        // }


        // for (int i = 1; i <= Math.sqrt(n); i++)
        // {
        //     if (n % i == 0)
        //     {

        //     if (n / i == i)
        //     {
        //         System.out.print(i + " ");
        //     }
        //     else
        //     {
        //         System.out.print(i + " " + n / i + " ");
        //     }
        //     }
        // }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
           if (n % i == 0)
           {
            if (n / i == i)
            {
                System.out.print(i + " ");
            }
            else
            {
                System.out.print(i + " ");
                list.add(n / i);
            }
           }
        }
        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
