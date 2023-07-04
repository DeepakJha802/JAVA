import java.lang.reflect.Array;
import java.util.*;

public class subSet_sum_without_duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        fun(0, arr, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void fun (int i, int[] arr , List<Integer> list , List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(list));
        for (int j = i; j < arr.length; j++)
        {
            if (i != j && arr[j] == arr[j - 1])
            {
                continue;
            }
            list.add(arr[j]);
            fun(j + 1, arr, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
