import java.util.Scanner;
public class Second_largest_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = Second_largest_array(arr);
        System.out.println(ans);
    }
    static int Second_largest_array (int[] arr)
    {
        if (arr.length == 0)
        {
            return Integer.MAX_VALUE;
        }
        int max = arr[0] , second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                second_max = max;
                max = arr[i];
            }
            else if (second_max < arr[i] && arr[i] != max)
            {
                second_max = arr[i];
            }
        }
        return second_max;
    }
}
