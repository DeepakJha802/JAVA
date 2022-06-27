import java.util.Scanner;

public class Arrays_multidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of students: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][];

        for(int i = 0; i < n; i++)
        {
            System.out.print("\nEnter the no of books of Student " + i + ": ");
            // int s = sc.nextInt();

            arr[i] = new int[sc.nextInt()];

            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print("Enter price for book " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

