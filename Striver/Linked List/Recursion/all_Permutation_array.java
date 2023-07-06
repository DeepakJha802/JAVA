import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class all_Permutation_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[n];
        Permutation(arr , freq , list , ans);
        System.out.println(ans);
    }
    public static void Permutation (int[] arr , boolean[] freq , List<Integer> list , List<List<Integer>> ans)
    {
        if (list.size() == arr.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (!freq[i])
            {
                freq[i] = true;
                list.add(arr[i]);
                Permutation(arr, freq, list, ans);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
}
