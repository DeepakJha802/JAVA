import java.util.Scanner;

public class Highest_occuring_character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(highest_occuring_char(str));
    }
    static char highest_occuring_char (String str)
    {
        int n = str.length();
        int[] freq = new int[256];

        int max_freq = 0;

        for (int i = 0; i < n; i++)
        {
            freq[str.charAt(i)]++;
            max_freq = Math.max(max_freq, freq[str.charAt(i)]);
        }

        char ans = '\0';

        for (int i = 0; i < n; i++)
        {
            if (freq[str.charAt(i)] == max_freq)
            {
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }
}

// In this program we find the highest occuring character in the string.

