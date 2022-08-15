import java.util.Scanner;
public class find_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(find_duplicate_element(arr));
    }
    static int find_duplicate_element(int[] arr)
    {
        for (int i = 0; i < (arr.length - 1); i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

}
