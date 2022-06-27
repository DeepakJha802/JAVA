import java.util.Arrays;
import java.util.Scanner;

import javax.management.relation.Role;

public class L_S_2D_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++)
        {
            int col = sc.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter which element you have to find: ");
        int target = sc.nextInt();
        int[] ans = Search(arr , target);
        System.out.println((Arrays.toString(ans)));
    }

    static int[] Search(int[][] arr , int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == target)
                {
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
