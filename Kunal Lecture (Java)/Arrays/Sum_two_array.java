import java.util.Scanner;
public class Sum_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1st array: ");
        int n = sc.nextInt();
        System.out.println("Size of 2nd array: ");
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
        sum_arrays(arr1 , arr2);
    }
    static void sum_arrays (int[] arr1 , int[] arr2)
    {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length);
        int[] output = new int[k + 1];
        while (i >= 0 && j >= 0)
        {
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while (i >= 0)
        {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        while (j >= 0)
        {
            int sum = arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        output[0] = carry;
        for (int l = 0; l < output.length; l++)
        {
            System.out.print(output[l] + " ");
        }
    }
}
