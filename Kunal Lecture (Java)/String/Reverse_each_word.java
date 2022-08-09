import java.util.Scanner;

public class Reverse_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Reverse_each_word_string(str));
    }
    static String Reverse_each_word_string (String str)
    {
        String ans = "";
        int start_index_word = 0;
        int i = 0;
        for (; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                int end_index_word = i - 1;
                String reverseword = "";
                for (int j = start_index_word; j <= end_index_word; j++)
                {
                    reverseword = str.charAt(j) + reverseword;
                }
                ans = ans + reverseword + " ";
                start_index_word = i + 1;
            }
        }
        int end_index_word = i - 1;
        String reverseword = "";
        for (int j = start_index_word; j <= end_index_word; j++)
        {
            reverseword = str.charAt(j) + reverseword;
        }
        ans = ans + reverseword;
        return ans;
    }
}
