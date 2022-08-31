import java.util.Scanner;

public class All_subset_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int[][] ans = subset_Sum(arr , (sum / 2));
        for (int i = 0; i < ans.length; ++i)
        {
            for (int j = 0; j < ans[i].length; ++j)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] subset_Sum(int[] arr , int k)
    {
        return subset_Array(arr, 0, k);
    }

    static int[][] subset_Array (int[] arr , int begin_index , int k)
    {
        if (begin_index == arr.length)
        {
            if (k == 0)
            {
                return new int[1][0];
            }
            else
            {
                return new int[0][0];
            }
        }

        int [][] small_output_first = subset_Array(arr, begin_index + 1, k);

        int [][] small_output_second = subset_Array(arr, begin_index + 1, k - arr[begin_index]);

        int [][] output = new int[small_output_first.length + small_output_second.length][];
        int index = 0;

        for (int i = 0; i < small_output_first.length; i++)
        {
            output[index++] = small_output_first[i];
        }
        for (int i = 0; i < small_output_second.length; i++)
        {
            output[index] = new int[small_output_second[i].length + 1];
            output[index][0] = arr[begin_index];

            for (int j = 0; j < small_output_second[i].length; j++)
            {
                output[index][j + 1] = small_output_second[i][j];
            }
            index++;
        }
        return output;
    }
}

// All subset if array which element sum is half of entire array.
