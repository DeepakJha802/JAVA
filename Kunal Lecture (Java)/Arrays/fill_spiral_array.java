import java.util.Scanner;

public class fill_spiral_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        Fill_spiral_array(arr , n);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Fill_spiral_array(int[][] arr , int n)
    {
        if (n == 0)
        {
            return arr;
        }
        int no_cols = n;
        int no_rows = n , row_start = 0 , cols_start = 0 , no_element = n * n , count = 0;
        while (count < no_element)
        {
            for (int i = cols_start; count < no_element && i < no_cols; ++i)
            {
                arr[row_start][i] = ++count;
            }

            row_start++;

            for (int i = row_start; count < no_element && i < no_rows; ++i)
            {
                arr[i][no_cols - 1] = ++count;
            }

            no_cols--;

            for (int i = no_cols - 1; count < no_element && i >= cols_start; --i)
            {
                arr[no_rows - 1][i] = ++count;
            }

            no_rows--;

            for (int i = no_rows - 1; count < no_element && i >= row_start; --i)
            {
                arr[i][cols_start] = ++count;
            }

            cols_start++;
        }
        return arr;
    }
}
