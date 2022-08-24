import java.util.Scanner;

public class Replace_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(string_Replace(str));
    }
    static String string_Replace(String str)
    {
        String s = "";
        if (str.length() <= 1)
        {
            return str;
        }
        String small = string_Replace(str.substring(1));
        if (str.charAt(0) == 'p' && small.charAt(0) == 'i')
        {
            s = "3.14" + small.substring(1);
        }
        else
        {
            s = str.charAt(0) + small;
        }
        return s;
    }
}

// Replace string "pi" to the value 3.14
// eg.  xpidppiid
// ans :- x3.14dp3.14id


