import java.util.Scanner;


public class first_target_index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i = 0;
        System.out.println(index(arr , n , k , i));
    }
    static int index (int[] arr , int n , int k, int i)
    {
        if ((arr[i] == k) && (i <= (n - 1)))
        {
            return i;
        }
        if (i > (n - 1))
        {
           return -1;
        }
        else
        {
            return index(arr, n, k, ++i);
        }
    }
}
