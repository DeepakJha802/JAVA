import java.util.Scanner;
public class no_rotations_rotated_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = no_rotations_rotated_array(arr);
        System.out.println(ans);
    }
    static int no_rotations_rotated_array (int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                return (i + 1);
            }
        }
        return 0;
    }
}

