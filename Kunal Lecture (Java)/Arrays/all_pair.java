import java.util.Scanner;

public class all_pair {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        print_all_pair(arr , n);
    }
    static void print_all_pair (int[] arr , int n)
    {
        for (int i = 0; i < (n - 1); i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}

// We have to print the all the pair of array
