import java.util.Scanner;

public class Compress_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(compressed_string(str));
    }
    static String compressed_string (String str)
    {
        int n = str.length();
        String ans = "";

        if (n == 0)
        {
            return ans;
        }
        int char_count = 1;
        ans += str.charAt(0);
        for (int i = 1; i < n; ++i)
        {
            if (str.charAt(i) == str.charAt(i - 1))
            {
                ++char_count;
            }
            else
            {
                if (char_count > 1)
                {
                    ans += char_count;
                    char_count  = 1;
                }
                ans += str.charAt(i);
            }
        }
        if (char_count > 1)
        {
            ans += char_count;
        }
        return ans;
    }
}

