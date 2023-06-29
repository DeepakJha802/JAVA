import java.util.*;
import java.lang.String;

class All_Subsequences
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        allSubsequence(0 , n , arr , list);
    }
    public static void allSubsequence(int i ,int n , int[] arr , ArrayList<Integer> list)
    {
        if (i == n) {
            if (list.size() >= 0)
            {
                System.out.println(list);
            }
        }
        else
        {
            list.add(arr[i]);
            allSubsequence(i + 1, n , arr, list);
            list.remove(list.size() - 1);
            allSubsequence(i + 1, n , arr, list);
        }
        return;
    }
}
