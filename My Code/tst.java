// import java.net.SocketPermission;

// public class tst{
//     public static void main (String[] arg)
//     {
//         char c = 'D';
//         System.out.println(c);

//         c = 68;
//         System.out.println(c);

//         c = '\104';
//         System.out.println(c);

//         c = '\u0044';
//         System.out.println(c);

//         String s  = "\u0044\u0045\105P\101\113";
//         System.out.println(s);
//         if (53=='5')
//         System.out.println("yes");
//         else
//         System.out.println("no");
//     }

// }

// import java.util.Scanner;

// public class tst {

//     public static void main(String[] args)
//     {
//       Scanner sc = new Scanner(System.in) ;
//       String str = sc.nextLine();
//       String str1 = sc.nextLine();
//       int l = str.length();
//       int l1 = str1.length();
//       System.out.println(l+l1);
//       if((str.compareTo(str1)) > (str1.compareTo(str)))
//       {
//           System.out.println("YES");
//       }
//       else
//       {
//           System.out.println("No");
//       }
//       String string1 = str.substring(0, 1);
//       String remainingLetters = str.substring(1, str.length());
//       String string2 = str1.substring(0, 1);
//       String remainingLetters2 = str1.substring(1, str1.length());

//       // change the first letter to uppercase
//       string1 = string1.toUpperCase();
//       string2 = string2.toUpperCase();

//       // join the two substrings
//       str = string1 + remainingLetters;
//       str1 = string2 + remainingLetters2;

//       System.out.println(""+str+" "+str1+"");

//     }
// }

// import java.util.Scanner;

// public class tst
// {

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int start = sc.nextInt();
//         int end  = sc.nextInt();
//             System.out.println(str.substring(start , end));

//     }

// }

// import java.util.Scanner;

// public class tst {

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int n = sc.nextInt();
//        int l = str.length();
//        System.out.println(str.substring((l-n),(l)));
//        System.out.println(str.substring(0,(n)));
//     }
// }

// import java.util.Scanner;

// public class tst {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//         int sum = 0;
//         for (int i = 0; i < 10; i++)
//         {
//             sum = sum + arr[i];
//             System.out.println("value is "+arr[i]);
//         }
//         System.out.println("sum =  "+sum);
//     }
// }

// import java.util.Scanner;

// public class tst {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t != 0) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             int temp;
//             for (int i = 0; i < n; i++)
//         {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] > arr[j])
//                 {
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//             boolean condition_satisfied = true;
//             for (int i = 1; i < n - 1; i++) {
//                 int d = arr[i] - arr[i - 1];
//                 int c = arr[i + 1] - arr[i];
//                 if ((2 * d != c) && (d != 2 * c)) {
//                     condition_satisfied = false;
//                     break;
//                 }
//             }
//             if(condition_satisfied)
//             System.out.print("YES\n");
//             else
//             System.out.print("NO\n");
//             t = t - 1;
//         }
//     }
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             List<Integer> arr = new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 arr.add(sc.nextInt());
//             }
//             boolean condition_satisfied = true;
//             Collections.sort(arr);
//             for (int i = 1; i < n - 1; ++i) {
//                 int a = arr.get(i) - arr.get(i - 1);
//                 int b = arr.get(i + 1) - arr.get(i);
//                 if (2 * a != b && a != 2 * b) {
//                     condition_satisfied = false;
//                     break;
//                 }
//             }
//             if (condition_satisfied) {
//                 System.out.println("Yes");
//             } else
//                 System.out.println("No");
//         }
//     }
// }

// import java.util.Scanner;
// import java.lang.*;
// import java.io.*;
// import java.util.Arrays;

// class tst {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0)
//      {
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0; i < n ; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         if (n == 1)
//         {
//             System.out.println(arr[0]);
//         }
//         else
//         {
//            int max = 0 , d = 0;
//            for (int i = n - 1; i >= 1; i--)
//            {
//                if (arr[i] == arr[i-1])
//                {
//                    d++;
//                }
//                else
//                {
//                    if (max < arr[i] + d)
//                    {
//                        max = arr[i] + d;
//                    }
//                    d = 0;
//                }
//            }
//            System.out.println(max);
//         }
//     }
//     }
// }

