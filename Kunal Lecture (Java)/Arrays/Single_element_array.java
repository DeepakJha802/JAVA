import java.util.Arrays;
import java.util.Scanner;

public class Single_element_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            if (((i == 0 ? -2 : nums[i-1]) != nums[i]) && ((i == nums.length - 1 ? -2 : nums[i+1]) != nums[i]))
            {
                System.out.println(nums[i]);
            }
        }
    }
}
