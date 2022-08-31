import java.net.SocketPermission;
import java.util.Scanner;

public class Subset_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[][] ans = all_subset_Array(arr , 0);
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans[i].length; ++j)
            {
                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }
    }

    static int[][] all_subset_Array (int[] arr , int start_index)
    {
        if (start_index == arr.length)
        {
            int[][] output = new int[1][0];
            return output;
        }

        int[][] small_output = all_subset_Array(arr, start_index + 1);

        int[][] output = new int[2 * small_output.length][];

        int k = 0;
        for (int i = 0; i < small_output.length; i++)
        {
            output[k] = new int[small_output[i].length];

            for (int j = 0; j < small_output[i].length; j++)
            {
                output[k][j] = small_output[i][j];
            }
            k++;
        }

        for (int i = 0; i < small_output.length; i++)
        {
            output[k] = new int[small_output[i].length + 1];

            output[k][0] = arr[start_index];

            for (int j = 1; j <= small_output[i].length; j++)
            {
                output[k][j] = small_output[i][j - 1];
            }
            k++;
        }
        return output;
    }
}
