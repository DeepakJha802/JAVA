import java.util.Scanner;

public class last_target_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(index(arr, n, k));
    }

    static int index(int[] arr, int n, int k) {
        if ((arr[n - 1] == k) && (n >= 0)) {
            return (n - 1);
        }
        if (n < 0) {
            return -1;
        } else {
            return index(arr, --n, k);
        }
    }
}
