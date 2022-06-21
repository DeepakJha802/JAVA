import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        // Q. take an input of two no and print the sum.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Numbers : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second Numbers : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("SUM = "+sum);

    }

}

// when we have any function in a class that is known as a method so in java we can call function in methods.

