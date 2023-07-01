import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combination_Sum {
    public  static void findCombinations (int i , int[] arr , int target ,  List<List<Integer>> ans , List<Integer> list)
    {
        if (i == arr.length)
        {
            if (target == 0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (arr[i] <= target)
        {
            list.add(arr[i]);
            findCombinations (i , arr , target - arr[i] , ans , list);
            list.remove(list.size() - 1);
        }
        findCombinations (i + 1 , arr , target , ans , list);
    }

    public static List<List<Integer>> combinationSum(int[] arr, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();

        findCombinations (0 , arr , target , ans , new ArrayList<>());

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
        System.out.println(combinationSum(arr,  target));
    }
}
