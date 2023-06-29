import java.util.*;
import java.lang.String;

class subsequences_sum_k
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
        ArrayList<Integer> list = new ArrayList<>();
        allSubsequence(0 , n , k , 0 , arr , list);
    }
    public static void allSubsequence(int i ,int n , int k , int sum , int[] arr , ArrayList<Integer> list)
    {
        if (i == n) {
            if (sum == k)
            {
                System.out.println(list);
            }
        }
        else
        {
            list.add(arr[i]);
            sum += arr[i];
            allSubsequence(i + 1, n , k , sum , arr, list);
            list.remove(list.size() - 1);
            sum -= arr[i];
            allSubsequence(i + 1, n , k , sum , arr, list);
        }
        return;
    }
}
