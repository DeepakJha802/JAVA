import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(result(x, n));
    }

    static int result(int x, int n) {
        if (n != 0) {
            return (x * result(x, n - 1));
        } else {
            return 1;
        }
    }
}
