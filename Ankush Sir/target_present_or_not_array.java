import java.util.Scanner;

public class target_present_or_not_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean ans = target(arr , n , k);
        System.out.println(ans);
    }

    static boolean target (int[] arr , int n , int k)
    {
        if (n == 0)
        {
            return false;
        }
        if (arr[n - 1] == k)
        {
            return true;
        }
        return target(arr, n - 1, k);
    }
}
