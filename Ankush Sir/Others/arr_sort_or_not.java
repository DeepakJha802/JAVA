import java.util.Scanner;

public class arr_sort_or_not {

    public static void main(String[] args) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(sort(arr , n));
    }

    static boolean sort (int[] arr , int n)
    {
        if (n == 0 || n == 1)
        {
            return true;
        }
        if (arr[n - 1] > arr[n - 2])
        {
            return false;
        }
        boolean ans = sort(arr , n - 1);
        return ans;
    }
}
