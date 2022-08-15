import java.util.Scanner;

public class All_substring_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print_substring(str);
    }
    static void print_substring (String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                for (int k = i; k <= j; ++k)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}

