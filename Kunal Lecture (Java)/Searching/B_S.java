import java.util.Scanner;
import java.util.Arrays;
public class B_S{
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

        int ans = BinarySearch(arr , target);
        if(ans < 0)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element at the index: " +ans);
        }
    }

    static int BinarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;

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
        return -1;
    }

}
// Binary Search is used for sorted arrays.

// Step :-

// 1. Take the middle element.
// 2. if (target element > middle element)
    //   {
    //     Search in the right.
    //   }
    //   else
    //   {
    //     Search in the left.
    //   }

// 3. if (target element == middle element)
//       {
//          return answer;
//       }

//  Best case time complexity of binary search is :- O(1) (Constant).
//  Worst case time complexity of binary search is :- O(logn).
