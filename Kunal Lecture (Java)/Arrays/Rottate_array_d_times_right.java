import java.util.Scanner;
public class Rottate_array_d_times_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rottate_array_d_times_right(arr , d);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rottate_array_d_times_right (int[] arr , int d)
    {
        if (arr == nul || arr.length < 2)
        {
            return;
        }
        int d = d % arr.length;
        int[] temp = new int[d];
        for (int i = arr.length - d, j = 0; i < arr.length; i++ , j++)
        {
            temp[j] = arr[i];
        }
        int k = d - 1;
        for (int i = (arr.length - (d + 1)) , j = arr.length - 1; j >= 0; i-- , j--)
        {
            if (j >= d)
            {
                arr[j] = arr[i];
            }
            else
            {
                arr[j] = temp[k];
                k--;
            }
        }
        return arr;
    }
}
