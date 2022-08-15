import java.util.Scanner;

public class Remove_conscutive_duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();

        System.out.println(answer_string(str));
    }
    static String answer_string (String str)
    {
        int n = str.length();

        if (n == 0)
        {
            return str;
        }

        String ans = "";
        int start_index = 0;

        while (start_index < n)
        {
            char unique_char = str.charAt(start_index);
            int next_char_index = start_index + 1;
            while (next_char_index < n && str.charAt(next_char_index) == unique_char)
            {
                next_char_index += 1;
            }
            ans += unique_char;
            start_index = next_char_index;
        }
        return ans;
    }
}

// In this code we only remove conscutive character.

// For eg. Deepakkumarjha
// ans:- Depakumarjha
