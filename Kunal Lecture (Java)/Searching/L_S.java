import java.util.Scanner;

public class L_S {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] nums = new int[n];

     for(int i = 0; i < n; i++)
     {
        // take elements form user.
        nums[i] = sc.nextInt();
     }
        int target = sc.nextInt();
        int ans = LinerSearch(nums , target);
        if (ans == -1)
        {
            System.out.println("element not found.");
        }
        else
        {
            System.out.println("element found at position: "+(ans+1));
        }
    }

    // search in the array: return the index if item found.
    // otherwise if item not found return -1.

    static int LinerSearch(int[] arr , int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }

        // run a loop
        for (int i = 0; i < arr.length; i++)
        {
            // cheack for element at every index if it is = target.
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

}

// Linear search is one of the techniques for searching some element in
// collection of data.
// Time complexity of Linear Search Best Case :- O(1) (constant).
// Time complexity of Linear Search Worst Case :- O(n).
