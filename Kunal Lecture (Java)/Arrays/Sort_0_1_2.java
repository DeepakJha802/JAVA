import java.util.Scanner;
public class Sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sort_zero_one_two(arr);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void sort_zero_one_two (int[] arr)
    {
        int next_zero = 0;
        int next_two = arr.length - 1;
        int i = 0;

        while (i <= next_two)
        {
            if (arr[i] == 0)
            {
                int temp = arr[next_zero];
                arr[next_zero] = arr[i];
                arr[i] = temp;
                i++;
                next_zero++;
            }
            else if (arr[i] == 2)
            {
                int temp = arr[next_two];
                arr[next_two] = arr[i];
                arr[i] = temp;
                next_two--;
            }
            else
            {
                i++;
            }
        }
    }
}
