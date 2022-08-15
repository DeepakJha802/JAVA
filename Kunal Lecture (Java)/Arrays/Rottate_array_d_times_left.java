import java.util.Scanner;

public class Rottate_array_d_times_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        after_rotation_d_times(arr , d);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] after_rotation_d_times (int[] arr , int d)
    {
        // Approach - 1.


        // int[] temp = new int[d];
        // for (int i = 0; i < d; i++)
        // {
        //     temp[i] = arr[i];
        // }
        // int k = 0;
        // for (int i = 0; i < arr.length; i++)
        // {
        //     if (i < (arr.length - d))
        //     {
        //         arr[i] = arr[i + d];
        //     }
        //     if (i >= (arr.length - d))
        //     {
        //         arr[i] = temp[k];
        //         k++;
        //     }
        // }

        // Approach - 2.

        for (int i = 0, j = arr.length - 1; j > i; i++ , j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0, j = (arr.length - (d + 1)); j > i; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = arr.length - d, j = arr.length - 1; j > i; i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
