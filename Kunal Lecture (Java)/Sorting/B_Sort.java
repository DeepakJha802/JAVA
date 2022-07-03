import java.util.Arrays;
import java.util.Scanner;

public class B_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble_sort(int[] arr)

    {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
// Bubble sort :- It is a comparison sort method.
// In Bubbe sort at every step we are compairing adjacent element.
// Also known as inplace sorting algorithms.
// Space complexity = O(1)(constant).
// Time complexity
// 1. Best case :- O(n). When array is sorted
// 2. Worst case :- O(n^2). Sorted in opposite thats mean we have to sort the
// increasing array to decreasing array.

// Stable Sorting Algorith:-
// It means when we have the order should be the same when the value is same
// Or the other hand when the original order is maintained for values that are equal.
// And when the order is not maintained and two are more values are same are called unstable sorting algo.

