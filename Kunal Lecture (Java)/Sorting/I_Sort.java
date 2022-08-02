import java.util.Arrays;
import java.util.Scanner;

public class I_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion_sort(int[] arr) {
        boolean already_sorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
// Insertion Sort :- In this sort we are partially sort the array.
// Best case time complexity :- O(n).
// Worst case time complexity :- O(n^2).
// It works good on smaller value of n . and also good works when the array is
// partially sorted.
// It also take part in hybrid sorting algorithms (Quick sort and merge sort).
// It Is Stable.
