import java.util.Scanner;

public class unique_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(unique_element(arr));
    }
    static int unique_element (int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < arr.length; j++)
            {
                if (i != j)
                {
                    if (arr[i] == arr[j])
                    {
                        break;
                    }
                }
            }
            if (j == arr.length)
            {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}
