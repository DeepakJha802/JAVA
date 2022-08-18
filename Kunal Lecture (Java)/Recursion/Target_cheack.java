import java.util.Scanner;

public class Target_cheack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int i = 0;
        System.out.println(present_or_not(arr , i , target));
    }
    static boolean present_or_not (int[] arr ,int i , int target)
    {
        if (i == arr.length)
        {
            return false;
        }
        if (arr[i] == target)
        {
            return true;
        }
        return present_or_not(arr, i + 1 , target);
    }
}
