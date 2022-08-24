// Approach - 1
// In this approach we can divide current array in too two different array and so on.......


// import java.util.Scanner;

// public class M_sort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         merge_sort(arr);
//         for (int i = 0; i < n; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     static void merge_sort (int[] arr)
//     {
//         if (arr.length <= 1)
//         {
//             return;
//         }
//         int mid = arr.length / 2;
//         int[] part_1 = new int[mid];
//         int[] part_2 = new int[arr.length - mid];
//         for (int i = 0; i < mid; i++)
//         {
//             part_1[i] = arr[i];
//         }
//         int k = 0;
//         for (int i = mid; i < arr.length; i++)
//         {
//             part_2[k] = arr[i];
//             k++;
//         }
//         merge_sort(part_1);
//         merge_sort(part_2);
//         merge(part_1 , part_2 , arr);
//     }
//     static void merge (int[] input_1 , int[] input_2 , int[] output)
//     {
//         int i = 0, j = 0 , k = 0;
//         while (i < input_1.length && j < input_2.length)
//         {
//             if (input_1[i] < input_2[j])
//             {
//                 output[k] = input_1[i];
//                 i++;
//                 k++;
//             }
//             else
//             {
//                 output[k] = input_2[j];
//                 k++;
//                 j++;
//             }
//         }
//         while (i < input_1.length)
//         {
//             output[k] = input_1[i];
//             k++;
//             i++;
//         }
//         while (j < input_2.length)
//         {
//             output[k] = input_2[j];
//             j++;
//             k++;
//         }
//     }
// }


// Approach - 2
// in this approach we can not create a new array we work on the same array.

import java.util.Scanner;

public class M_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        merge_sort(arr , 0 , arr.length - 1);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void merge_sort (int[] arr , int start , int end)
    {
        if (start >= end)
        {
            return;
        }

        int mid = (start + end) / 2;

        merge_sort(arr, start, mid);
        merge_sort(arr, mid + 1, end);
        Merge_two_sorted_array (arr , start , end);
    }

    static void Merge_two_sorted_array (int[] arr , int start , int end)
    {
        int i = start;
        int mid = (start + end) / 2;
        int j = mid + 1;
        int k = 0;
        int[] output = new int[end - start + 1];

        while (i <= mid && j <= end)
        {
            if (arr[i] < arr[j])
            {
                output[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                output[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid)
        {
            output[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end )
        {
            output[k] = arr[j];
            j++;
            k++;
        }

        int l = start;

        for (int z = 0; z < output.length; ++z)
        {
            arr[l++] = output[z];
        }
    }
}


// In the merge sort we are divide the array in two parts and applay the merge sort on the both part the array.
// After sorting the both part of the array we are merge both part in sorted manner.

// Merge sort is basically based on divide and conquer.
// Time complexity :- nlogn.
// Space complexity :- O(n). (Beacuse at any point of time maximum extra space using the program is n).
// maximum no of functions that we can have at any point of time in our memory :- log(n).
