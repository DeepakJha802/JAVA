import java.util.Scanner;
public class B_S_Rotated_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sorted array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array in sorted order: ");
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int ans = ans_find(nums , target);
        System.out.println(ans);
    }
    static int ans_find (int[] nums , int target)
    {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e)
        {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
            {
                return mid;
            }
            if (nums[mid] >= nums[s])
            {
                if ((nums[s] <= target) && (nums[mid] >= target))
                {
                    e = mid - 1;
                }
                else
                {
                    s = mid + 1;
                }
            }
            else
            {
                if ((target >= nums[mid]) && (target <= nums[e]))
                {
                    s = mid + 1;
                }
                else
                {
                    e = mid - 1;
                }
            }
        }
        return 0;
    }
}
