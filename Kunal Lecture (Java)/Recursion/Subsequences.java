import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] ans = findSubsequences(str);
        for (int i = 0; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
    static String[] findSubsequences (String str)
    {
        if (str.length() == 0)
        {
            String[] ans = {""};
            return ans;
        }
        String[] small_ans = findSubsequences(str.substring(1));
        String[] ans = new String[2 * small_ans.length];

        for (int i = 0; i < small_ans.length; i++)
        {
            ans[i] = small_ans[i];
        }
        for (int i = 0; i < small_ans.length; i++)
        {
            ans[i + small_ans.length] = str.charAt(0) + small_ans[i];
        }
        return ans;
    }
}
