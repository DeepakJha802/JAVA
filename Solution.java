// class SampleDemo implements Runnable {

//     private Thread t;
//     private String threadName;

//     SampleDemo (String threadName){
//         this.threadName = threadName;
//     }

//     public void run()
//     {
//         while (true)
//              System.out.print(threadName);
//     }

//     public void start ()
//     {
//        if (t == null)
//        {
//           t = new Thread (this, threadName);
//           t.start ();
//        }
//     }
//  }

//  public class Solution {

//     public static void main(String args[]) {

//        SampleDemo A = new SampleDemo( "A");
//        SampleDemo B = new SampleDemo( "B");

//        B.start();
//        A.start();
//     }
//  }

class Solution {
    public int[] twoSum(int[] nums, int k)
    {
        int [] ans = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 1 + i; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == k)
                {
                    ans[0] = i;
                    ans[1] = j;

                }
            }
        }
         return ans;

    }
}
