import java.util.Scanner;

public class Sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum_array(arr, n));
    }

    static int sum_array(int[] arr, int n) {
        if (n == 0)
            return 0;
        else
            return arr[n - 1] + sum_array(arr, n - 1);
    }
}
