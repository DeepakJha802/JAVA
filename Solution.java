// import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the sequence:");
//         int n = sc.nextInt();
//         int[] sequence = new int[n];
//         System.out.println("Enter the elements of the sequence:");
//         for (int i = 0; i < n; i++) {
//             sequence[i] = sc.nextInt();
//         }
//         System.out.println("Enter the value of K:");
//         int k = sc.nextInt();
//         sc.close();
//         sortSequence(sequence, k);
//         System.out.println("Sorted sequence:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(sequence[i] + " ");
//         }
//     }

//     public static void sortSequence(int[] sequence, int k) {
//         int n = sequence.length;
//         int start = 0;
//         while (start < n) {
//             int end = Math.min(start + k - 1, n - 1);
//             Arrays.sort(sequence, start, end + 1);
//             start += k;
//         }
//     }
// }


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the sequence:");
        int n = sc.nextInt();
        int[] sequence = new int[n];
        System.out.println("Enter the elements of the sequence:");
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        sc.close();
        sortSequence(sequence, k);
        System.out.println("Sorted sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }

    public static void sortSequence(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0;
        while (start < n) {
            int end = Math.min(start + k - 1, n - 1);
            Arrays.sort(sequence, start, end + 1);
            start += k;
        }
    }
}
