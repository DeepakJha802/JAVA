import java.util.Scanner;
public class B_S_Agnostic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int ans = Agnostic_BS(arr, target);
        if (ans < 0) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element at the index: " + ans);
        }
    }

    static int Agnostic_BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAgs = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2; // In some cases may be exceeds the range of

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }

            if (isAgs)
            {
               if (target < arr[mid])
               {
                end = mid - 1;
               }
               else
               {
                start = mid + 1;
               }
            }
            else
            {
                if (target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
