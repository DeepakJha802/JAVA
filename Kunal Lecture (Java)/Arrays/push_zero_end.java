import java.util.Scanner;
public class push_zero_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        push_zero_end(arr);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void push_zero_end (int[] arr)
    {
        int non_zero_index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[non_zero_index];
                arr[non_zero_index] = temp;
                non_zero_index++;
            }
        }
    }
}
