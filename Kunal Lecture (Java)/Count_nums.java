// Q. Find the total no of k in n.

import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem == k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
