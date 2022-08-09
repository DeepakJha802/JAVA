import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubstring(str);
    }

    // T - 1


    // public static void printSubstring  (String str)
    // {
    //     for (int i = 0; i < str.length(); i++)
    //     {
    //         for (int j = i; j < str.length(); j++)
    //         {
    //             System.out.println(str.substring(i , j + 1));
    //         }
    //     }
    // }


    // T - 2

    public static void printSubstring (String str)
    {
        for (int len = 1; len <= str.length(); len++)
        {
            for (int start = 0; start <= str.length() - len; start++)
            {
                int end = start + len - 1;
                System.out.println(str.substring(start , end  + 1));
            }
        }
    }
}


// If length of the String is N then the no of possible substring = n + (n - 1) + (n - 2) + (n - 3) + (n - 4) +...........+ 1.
//                                                                 (n * ( n + 1)) / 2.
