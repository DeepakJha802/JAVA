import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;
public class B_S_Floor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array in sorted order: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int ans = floor(arr , target);
        if(ans < 0)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element at the index: " +ans);
        }
    }

    // In the floor :- We have to return the greatest no <= target.
    static int floor(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;

        // What if the target is smaller than the first element of the array.

        if (target < arr[0])
        {
            return -1;
        }

        while (start <= end)
        {
            // int mid = (start + end) / 2;  // In some cases may be exceeds the range of int.
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}
