import java.util.Scanner;
public class B_S_Mountain_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of mountain array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the mountain array: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = Mountain(arr);
        System.out.println("Position of the peak element in the mountain array: " + ans);

    }

    static int Mountain(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
            {
                // we are in decreasing part in array. this may be the answer but look at left once.
                // That's why end != mid - 1.
                end = mid;
            }
            else
            {
                // We are in the acending part in the array.
                start = mid + 1;
            }
        }
        return start;
    }
}

// Mountain Array :- This array is increases first than decreases.
