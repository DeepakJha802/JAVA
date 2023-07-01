import java.util.*;
import java.lang.String;

class count_subsequence_sum_k
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int count = allSubsequence(0 , n , k , 0 , arr);
        System.out.println(count);
    }
    public static int allSubsequence(int i ,int n , int k , int sum , int[] arr)
    {
        if (i == n) {
            if (sum == k)
            {
                return 1;
            }
            return 0;
        }
        else
        {
            sum += arr[i];
            int l = allSubsequence(i + 1, n , k , sum , arr);

            sum -= arr[i];
            int r = allSubsequence(i + 1, n , k , sum , arr);

            return (l + r);
        }
    }
}
