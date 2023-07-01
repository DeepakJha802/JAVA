import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combination_sum_without_duplicates {
    public static void combinationSum (int i , int target , int[] arr ,  List<List<Integer>> ans , List<Integer> list)
    {

        if (target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < arr.length; j++)
        {
            if (j > i && arr[j] == arr[j - 1])
            {
                continue;
            }
            if (arr[j] > target)
            {
                break;
            }

            list.add(arr[j]);
            combinationSum(j + 1 , target - arr[j],arr, ans, list);
            list.remove(list.size() - 1);

        }
    }

    public static List<List<Integer>> combinationSum2(int[] nums, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        combinationSum(0 , target , nums , ans , new ArrayList<>());

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(combinationSum2(arr,  target));
    }
}
