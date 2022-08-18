import java.util.Scanner;

public class Replace_char_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        System.out.println(after_Replace_char(str , ch , c));
    }
    static String after_Replace_char (String str , char ch , char c)
    {
        if (str.length() == 0)
        {
            return "";
        }
        char ans;
        if (str.charAt(0) == c)
        {
            ans = ch;
        }
        else
        {
            ans = str.charAt(0);
        }
        String small_ans =  after_Replace_char(str.substring(1), ch, c);
        return ans + small_ans;
    }
}

// Here ch is a character which is replace the another character.
// c is the character which is have to replaced by the ch character.
