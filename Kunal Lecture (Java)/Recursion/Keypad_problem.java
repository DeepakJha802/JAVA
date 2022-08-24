import java.util.Scanner;

public class Keypad_problem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = keypad(n);
        for (int i = 0; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
    static String[] single_digit(int n)
    {
        if (n <= 1 || n > 10)
        {
            System.exit(0);
        }
        if (n == 2)
        {
            String[] output = {"a" , "b" , "c"};
            return output;
        }
        else if (n == 3)
        {
            String[] output = {"d" , "e" , "f"};
            return output;
        }
        else if (n == 4)
        {
            String[] output = {"g" , "h" , "i"};
            return output;
        }
        else if (n == 5)
        {
            String[] output = {"j" , "k" , "l"};
            return output;
        }
        else if (n == 6)
        {
            String[] output = {"m" , "n" , "o"};
            return output;
        }
        else if (n == 7)
        {
            String[] output = {"p" , "q" , "r" , "s"};
            return output;
        }
        else if (n == 8)
        {
            String[] output = {"t" , "u" , "v"};
            return output;
        }
        else
        {
            String[] output = {"w" , "x" , "y" , "z"};
            return output;
        }
    }
    static String[] keypad (int n)
    {
        if (n == 0)
        {
            String[] output = {""};
            return output;
        }
        String[] small_no_array = keypad(n / 10);
        String[] single_digit_output = single_digit(n % 10);
        String[] output = new String[single_digit_output.length * small_no_array.length];
        int k = 0;
        for (int i = 0 ; i < single_digit_output.length; i++)
        {
            for (int j = 0; j < small_no_array.length; j++)
            {
                output[k] = small_no_array[j] + single_digit_output[i];
                k++;
            }
        }
        return output;
    }
}

