import java.util.Scanner;

public class Subset_sum_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[][] output = subset_Sum_k(arr , k);
        for (int i = 0; i < output.length; i++)
        {
            for (int j = 0; j < output[i].length; j++)
            {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] subset_Sum_k(int[] input , int k)
    {
        return all_Subset_Sum_of_K(input , 0 , k);
    }

    static int[][] all_Subset_Sum_of_K (int[] input , int start_index , int k)
    {
        if (start_index == input.length)
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
        int[][] small_output_1 = all_Subset_Sum_of_K(input, start_index + 1, k);

        int[][] small_output_2 = all_Subset_Sum_of_K(input, start_index + 1, k - input[start_index]);

        int[][] output =  new int[small_output_1.length + small_output_2.length][];

        int index = 0;

        for (int i = 0; i < small_output_1.length; i++)
        {
            output[index++] = small_output_1[i];
        }
        for (int i = 0; i < small_output_2.length; i++)
        {
            output[index] = new int[small_output_2[i].length + 1];
            output[index][0] = input[start_index];

            for (int j = 0; j < small_output_2[i].length; j++)
            {
                output[index][j + 1] = small_output_2[i][j];
            }
            index++;
        }
        return output;
    }
}
