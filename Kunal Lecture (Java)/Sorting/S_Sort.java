import java.util.Arrays;
import java.util.Scanner;
public class S_Sort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection_sort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int end = arr.length - i - 1;
            int max = max_index(arr , 0 , end);
            swap(arr, max, end);
        }
    }

    static int max_index(int[] arr , int start , int end)
    {
        int max = start;
        for(int i = start; i <= end; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// Selection Sort :-
//  Time Complexity :-
// 1. Best Case :- O(n^2).
// 2. Worst Case :- O(n^2).
// It perform well on small list/arrays.
