import java.util.Scanner;

public class Equilibrium_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println( equilibrium_index_array (arr));
    }
    static int equilibrium_index_array (int[] arr)
    {
        int right_sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            right_sum += arr[i];
        }
        int left_sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            right_sum -= arr[i];
            if (right_sum == left_sum)
            {
                return i;
            }
            left_sum += arr[i];
        }
        return -1;
    }
}

// Time complexity :- O(n).
