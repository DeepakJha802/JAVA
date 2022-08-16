import java.util.ArrayList;
import java.util.Scanner;


public class intersection_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter 1st array: ");
        for (int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd array: ");
        for (int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }
        intersection_element(arr1, arr2);
    }
    static void intersection_element(int arr1[] ,int[] arr2)
    {
        // Approach - 1.

        // int i = 0;
        // int j = 0;
        // ArrayList<Integer> list = new ArrayList<>();
        // while (i < nums1.length; && j < nums2.length)
        // {
        //     if (nums1[i] == nums2[j])
        //     {
        //         list.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        //     else if (nums1[i] < nums2[j])
        //     {
        //         i++;
        //     }
        //     else
        //     {
        //         j++;
        //     }
        // }


        // Approach - 2

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
    }
}

