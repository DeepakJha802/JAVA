// Bulid A calculator program.
// Take input fro user till user does not press X or x.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            // take the operator as input.

            System.out.println("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers.
                System.out.println("Enter two numbers : ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '%') {
                    ans = n1 % n2;
                }
                System.out.println(ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operations!!");
            }
        }
    }
}
