import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = sum(arr , n , 0);
        System.out.println(ans);
    }

    static int sum(int[] arr , int n , int s)
    {
        if (n == 1)
        {
            return arr[0];
        }
        int total = arr[n - 1] + sum(arr, n - 1, s);
        return total;
    }

}
