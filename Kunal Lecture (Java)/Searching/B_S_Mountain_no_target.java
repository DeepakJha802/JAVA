public class B_S_Mountain_no_target
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array in sorted order: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int ans = ans_find(arr , target);
    }

    int Search (int[] arr, int target)
    {
        int peak = Mountain(arr);
        int firstTry = Agnostic_BS(arr, target, 0, peak);
        if (firstTry != -1)
        {
            return firstTry;
        }
        return Agnostic_BS(arr, target, peak + 1, arr.length - 1);
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

        static int Agnostic_BS(int[] arr, int target , int start , int end) {


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
// We have to find the no of target in the mountain array.
