// class Solution {
//     public static void main(String[] args) {
//         int n = 19;
//         System.out.println(integerReplacement(n));
//     }

//     static int integerReplacement(int n) {

//         int a = 2;
//         int max = Integer.MAX_VALUE;
//         while ((a--) != 0) {
//             int count = 0;
//             int b = n;
//             while (b != 1) {
//                 if (b % 2 == 0) {
//                     b = b / 2;
//                     count++;
//                 }
//                 else {

//                     if (a == 2) {
//                         b = b - 1;
//                         count++;
//                     }
//                     else if (a == 1) {
//                         b = b + 1;
//                         count++;
//                     }
//                 }
//             }
//             if (max > count) {
//                 max = count;
//             }
//         }
//         return max;
//     }
// }


