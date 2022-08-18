import java.util.Scanner;

public class Delete_character_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(remove_character(str , ch));
    }
    static String remove_character(String str , char ch)
    {
        if (str.length() == 0)
        {
            return str;
        }
        String ans = "";
        if (str.charAt(0) != ch)
        {
            ans = ans + str.charAt(0);
        }
        String small_ans = remove_character(str.substring(1) , ch);
        return ans + small_ans;
    }
}
