
// // import java.util.*;
// // import java.util.ArrayList;
// // import java.util.Collection;
// // import java.util.Scanner;

// // public class Solution
// // {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int[] arr = new int[n];
// //         for (int i = 0; i < n; i++)
// //         {
// //             arr[i] = sc.nextInt();
// //         }
// //         ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
// //         int sum=0;
// //         for(int i=0;i<n;i++){
// //             if(prime(arr[i])){
// //                 arr1.add(arr[i]);
// //                 sum+=arr[i];
// //             }
// //         }
// //         Collections.sort(arr1);
// //         sum-=arr1.get(0);
// //         System.out.println(sum);

// //     }
// //     public static boolean prime(int num){
// //         if(num<=1)
// //         {
// //             return false;
// //         }
// //        for(int i=2;i<=num/2;i++)
// //        {
// //            if((num%i)==0)
// //                return  false;
// //        }
// //        return true;
// //     }
// // }


// // import java.util.Scanner;

// // public class Solution
// // {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int c = sc.nextInt();
// //         int d = sc.nextInt();
// //         int PIN = (largest(a) * largest(b) * largest(c)) + d;
// //         System.out.println(PIN);
// //     }
// //     public static int largest(int a ){
// //         int maxDigit=0;
// //         while(a>0){
// //             int digit=a%10;
// //             if(digit>maxDigit){
// //                 maxDigit=digit;
// //             }
// //             a=a/10;
// //         }
// //         return maxDigit;
// //     }
// //      public static int smallest(int a ){
// //         int minDigit=9;
// //         while(a>0){
// //             int digit=a%10;
// //             if(digit<minDigit){
// //                 minDigit=digit;
// //             }
// //             a=a/10;
// //         }
// //         return minDigit;
// //     }
// // }

import java.lang.String;
import java.util.*;

class Solution
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        allSubsequence(0 , n , arr , list);
    }
    public static void allSubsequence(int i ,int n , int[] arr , ArrayList<Integer> list)
    {
        if (i == n) {
            for (int it : list) {
                System.out.print(it + " ");
            }
            if (list.size() == 0) {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        list.add(arr[i]);
        allSubsequence(i + 1, n , arr, list);
        allSubsequence(i - 1, n , arr, list);
        list.remove(i);
    }
}
