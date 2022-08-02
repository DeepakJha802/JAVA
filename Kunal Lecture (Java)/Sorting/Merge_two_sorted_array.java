import java.util.Scanner;

public class Merge_two_sorted_array {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st sorted array: ");
        int m = sc.nextInt();

        int[] arr1 = new int[m];
        System.out.println("Enter the element in the 1st sorted array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of 2nd sorted array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        System.out.println("Enter the element in the 2nd sorted array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(merge_two_sorted_array(arr1 , arr2 , m , n));
    }
    static int[] merge_two_sorted_array (int[] arr1 , int[] arr2 , int m , int n)
    {

        int[] temp = new int[m + n];
        int i = 0 , j = 0 , k = 0;

        while (i < m && j < n)
        {
            if (arr1[i] <= arr2[j])
            {
                temp[k] = arr1[i];
                i++;
            }
            else
            {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < m)
        {
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n)
        {
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp;
    }
}
