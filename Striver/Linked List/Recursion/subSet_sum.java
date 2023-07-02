import java.util.*;

public class subSet_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();

        fun(0, 0, arr, n, ans);

        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void fun (int i , int sum , int[] arr , int n , ArrayList<Integer> ans)
    {
        if (i == n)
        {
            ans.add(sum);
            return;
        }
        fun (i + 1 , sum + arr[i] , arr , n , ans);

        fun(i + 1 , sum , arr , n , ans);
    }
}
