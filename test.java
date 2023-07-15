// import java.util.Scanner;

// // public class test {
// //     public static void main(String[] args) {
// //         // Scanner sc = new Scanner(System.in);
// //         // int n = sc.nextInt();
// //         // int[] arr = new int[n];
// //         // for (int i = 0; i < n; i++)
// //         // {
// //         //     arr[i] = sc.nextInt();
// //         // }
// //         // int k = sc.nextInt();
// //         // Solution ob = new Solution();
// //         // int[] tmp = ob.twoSum(arr , k);
// //         // System.out.println(tmp[0]);
// //         // System.out.println(tmp[1]);
// //         int a = 18;
// //         String s = a > 10 ? "Right" : "Not right";
// //         System.out.println(s);
// //     }
// // }

// // class test
// // {
// //     public static void main(String[] args)
// //     {
// //         int[] arr = {10, 5, 70, 1};
// //         char[] ans = new char[arr.length];
// //         boolean[] done = new boolean[arr.length];

// //         char c = 'a';

// //         for (int i = 0; i < arr.length; ++i)
// //         {
// //             int smallest_element = Integer.MAX_VALUE;
// //             int smallest_index = -1;

// //             for (int j = 0; j < arr.length; ++j)
// //             {
// //                 if (!(done[j]))
// //                 {
// //                     if (arr[j] < smallest_element)
// //                     {
// //                         smallest_element = arr[j];
// //                         smallest_index = j;
// //                     }
// //                 }
// //             }

// //             ans[smallest_index] = c++;
// //             done[smallest_index] = true;
// //         }

// //         for (int i = 0; i < arr.length; ++i)
// //             System.out.println(ans[i]);
// //     }
// // }

// public class EncodingThreeStrings {

//     public static class Result {
//         public String output1;
//         public String output2;
//         public String output3;

//         public Result(String output1, String output2, String output3) {
//             this.output1 = output1;
//             this.output2 = output2;
//             this.output3 = output3;
//         }
//     }

//     public static Result encodeThreeStrings(String input1, String input2, String input3) {
//         // Step 1: Split each string into 3 p.
//         String[] p1 = splitString(input1);
//         String[] p2 = splitString(input2);
//         String[] p3 = splitString(input3);

//         // Step 2: Concatenate the p to form the output strings.
//         String s1 = p1[0] + p2[2] + p3[1];
//         String s2 = p1[1] + p2[0] + p3[2];
//         String s3 = p1[2] + p2[1] + p3[0];

//         // Step 3: Toggle the case of the third output string.
//         s3 = toggleCase(s3);

//         // Return the result.
//         return new Result(s1, s2, s3);
//     }

//     private static String[] splitString(String str) {
//         int len = str.length();
//         int part = len / 3;
//         String[] p = new String[3];

//         if (len % 3 == 0) {
//             p[0] = str.substring(0, part);
//             p[1] = str.substring(part, 2 * part);
//             p[2] = str.substring(2 * part, len);
//         } else if (len % 3 == 1) {
//             p[0] = str.substring(0, part);
//             p[1] = str.substring(part, 2 * part + 1);
//             p[2] = str.substring(2 * part + 1, len);
//         } else {
//             p[0] = str.substring(0, part + 1);
//             p[1] = str.substring(part + 1, 2 * part + 1);
//             p[2] = str.substring(2 * part + 1, len);
//         }

//         return p;
//     }

//     private static String toggleCase(String str) {
//         StringBuilder sb = new StringBuilder();
//         for (char c : str.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 sb.append(Character.toUpperCase(c));
//             } else {
//                 sb.append(Character.toLowerCase(c));
//             }
//         }

//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         Result result = encodeThreeStrings("John", "Johny", "Janardhan");
//         System.out.println("Output1: " + result.output1);
//         System.out.println("Output2: " + result.output2);
//         System.out.println("Output3: " + result.output3);
//     }
// }



import java.util.*;

public class test{
    public static void main(String[] args) {
        int input1 = 3;
        String[] input2 = {"Ate" , "Ace","Girl"};
        String result = findStringVowelFirstAndLast(input1, input2);
        System.out.println(result);
    }

    public static String findStringVowelFirstAndLast(int input1, String[] input2) {
        String ans = "";
        for (String str : input2) {
            if (isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1))) {
                ans += str;
            }
        }
        return ans.toLowerCase();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

// import java.util.Scanner;

// class test
// {
//     public static void main(String[] args) {



//     public int findKey(int input1 , int input2 ,int input3)
//     {
//         int ans = (input1 / 1000) * ((input2 % 1000) / 100) + small_Digit(input3);
//         return ans;
//     }
//     public int small_Digit(int n)
//     {
//         int min = 10;
//         while(n != 0)
//         {
//             int rem = n % 10;
//             if (min >= rem)
//             {
//                 min = rem;
//             }
//             n /= 10;
//         }
//         return min;
//     }


// }
