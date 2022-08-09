import java.util.Scanner;

public class spiral_pattern_2D_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        Print_spiral_pattern(arr);
    }

    static void Print_spiral_pattern(int[][] arr)
    {
        int no_rows = arr.length;
        if (no_rows == 0)
        {
            return;
        }
        int no_cols = arr[0].length;

        int row_start = 0 , cols_start = 0;

        int no_element = no_cols * no_rows , count = 0;

        while (count < no_element)
        {
            for (int i = cols_start; count < no_element && i < no_cols; ++i)
            {
                System.out.print(arr[row_start][i] + " ");
                count++;
            }

            row_start++;

            for (int i = row_start; count < no_element && i < no_rows; ++i)
            {
                System.out.print(arr[i][no_cols - 1] + " ");
                count++;
            }

            no_cols--;

            for (int i = no_cols - 1; count < no_element && i >= cols_start; --i)
            {
                System.out.print(arr[no_rows - 1][i] + " ");
                count++;
            }

            no_rows--;

            for (int i = no_rows - 1; count < no_element && i >= row_start; --i)
            {
                System.out.print(arr[i][cols_start] + " ");
                count++;
            }

            cols_start++;
        }
    }
}
