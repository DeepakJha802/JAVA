import java.util.Arrays;
import java.util.Scanner;

public class C_Sort {
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
        Cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Cyclic_sort (int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct_index = arr[i] - 1;
            if (arr[correct_index] != arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }
            else
            {
                i++;
            }
        }
    }
}

// When given no. from range 1 to N :- use cyclic sort.
// For eg. 5 ,2 , 4 , 3 , 1.
// Best case time complexity :-
// Worst case time complexity :- O(n).
