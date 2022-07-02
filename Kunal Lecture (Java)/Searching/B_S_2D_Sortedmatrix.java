import java.util.Arrays;

public class B_S_2D_Sortedmatrix {
    public static void main(String[] args)
    {
        int[][] arr = {
                 {1 , 2 , 3},
                 {4 , 5 , 6},
                 {7 , 8 , 9}
        };
        System.out.println(Arrays.toString(search(arr, 89)));
    }

    static int[] binarySearch(int[][] matrix , int row , int col_start , int col_end , int target)
    {
        while(col_start <= col_end)
        {
            int mid = col_start + (col_end - col_start) / 2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row , mid};
            }
            if (matrix[row][mid] < target)
            {
                col_start = mid + 1;
            }
            else
            {
             col_end = mid - 1;
            }
        }
        return new int[]{-1 , -1};
    }

    static int[] search(int[][] matrix , int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious matrix may be empty.
        if (rows == 1)
        {
            return binarySearch(matrix , 0 , 0 , cols - 1, target);
        }
        int row_start = 0;
        int row_end = rows - 1;
        int col_mid = cols / 2;
        while (row_start < (row_end - 1))
        {
            int mid = row_start + (row_end - row_start) / 2;
            if (matrix[mid][col_mid] == target)
            {
                return new int[]{mid , col_mid};
            }
            if (matrix[mid][col_mid] < target)
            {
                row_start = mid;
            }
            else
            {
                row_end = mid;
            }
        }
        if (matrix[row_start][col_mid] == target)
        {
            return new int[]{row_start , col_mid};
        }
        if (matrix[row_start + 1][col_mid] == target)
        {
            return new int[]{row_start + 1 , col_mid};
        }
        // seaarch in 1 st half.
        if (target <= matrix[row_start][col_mid - 1])
        {
            return binarySearch(matrix , row_start , 0 ,col_mid - 1, target);
        }
        // Search in 2nd half.
        if (target >= matrix[row_start][col_mid + 1] && target >= matrix[row_start][cols - 1])
        {
            return binarySearch(matrix , row_start , col_mid + 1 , cols - 1 , target);
        }
        // search in 3rd half.
        if (target <= matrix[row_start + 1][col_mid - 1])
        {
            return binarySearch(matrix , row_start + 1 , 0 , col_mid - 1 , target);
        }
        // search in 4th half.
        else
        {
            return binarySearch(matrix , row_start + 1 , col_mid + 1 , cols - 1 , target);
        }

    }

}
