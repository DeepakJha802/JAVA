// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         int[] ans = new int[k];
//         int count = Integer.MIN_VALUE;
//         for (int i = 0; i < k; i++)
//         {
//             int pos = -1;
//             int max = Integer.MIN_VALUE;
//             for (int j = 0; j < n; j++)
//             {
//                 if (max < arr[j] && max <= count)
//                 {
//                     max = arr[j];
//                     pos = j;
//                 }
//             }
//             arr[i] = pos;
//             count = max;
//         }
//         for (int i = 0; i < k; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Scanner;

public class Solution
{
    static double area(double side)
    {
        return (side * side);
    }

    static double area(double length, double breadth)
    {
        return (length * breadth);
    }

    static double perimeter(double side)
    {
        return (4.0 * side);
    }

    static double perimeter(double length, double breadth)
    {
        return (2.0 * (length + breadth));
    }

     static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // aage khud se krlo bsdk
    }
}
