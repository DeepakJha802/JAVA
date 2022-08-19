import java.util.Scanner;

public class Q_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        quick_sort(arr);

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void quick_sort (int[] arr)
    {
        quick_sort(arr , 0 , arr.length - 1);
    }

    static void quick_sort (int[] arr , int start_index , int end_index)
    {
        if (start_index >= end_index)
        {
            return;
        }
        int partition_index = partition(arr , start_index , end_index);
        quick_sort(arr, start_index, partition_index - 1);
        quick_sort(arr, partition_index + 1, end_index);
    }

    static int partition (int[] arr , int start_index , int end_index)
    {
        int pivot = arr[start_index];
        int count = 0;
        for (int i = start_index + 1; i <= end_index; i++)
        {
            if (arr[i] <= pivot)
            {
                count++;
            }
        }
        int pivot_index = start_index + count;
        arr[start_index] = arr[pivot_index];
        arr[pivot_index] = pivot;

        int i = start_index , j = end_index;
        while (i < j)
        {
            while (i <= end_index && arr[i] <= pivot)
            {
                i++;
            }
            while (arr[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivot_index;
    }
}
