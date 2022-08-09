import java.util.Scanner;

public class wave_form_2D_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        wavePrint(arr);
    }

    static void wavePrint(int[][] arr)
    {
        int rows = arr.length;
        int cols = arr[0].length;  // I assume that all rows has equal no of colums.

        for (int j = 0; j < cols; j++)
        {
            if (j % 2 == 0)
            {
                for (int i = 0; i < rows; i++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int i = rows - 1; i >= 0; i--)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
