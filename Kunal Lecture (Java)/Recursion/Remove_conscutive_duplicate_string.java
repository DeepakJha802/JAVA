import java.util.Scanner;

public class Remove_conscutive_duplicate_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(deleted_Duplicate(str));
    }
    static String deleted_Duplicate (String str)
    {
        if (str.length() == 1)
        {
            return str;
        }
        if (str.charAt(0) == str.charAt(1))
        {
            return deleted_Duplicate(str.substring(1));
        }
        else
        {
            String ans = deleted_Duplicate(str.substring(1));
            return str.charAt(0) + ans;
        }
    }
}
