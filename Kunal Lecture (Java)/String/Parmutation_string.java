import java.util.Scanner;

public class Parmutation_string {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(String_Permutation(str1, str2));
    }
    static boolean String_Permutation (String str1 , String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        int[] freq = new int[256];

        for (int i = 0; i < 256; i++)
        {
            freq[i] = 0;
        }
        for (int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            ++freq[ch];
        }
        for (int i = 0; i < str2.length(); i++)
        {
            char ch = str2.charAt(i);
            --freq[ch];
        }
        for (int i = 0; i < 256; i++)
        {
            if (freq[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}


// What means by String Permutation ?

// Permutation of the string means all the possible new strings that can be formed by interchanging the position of the characters of the string.
//  For example, string ABC has permutations [ABC, ACB, BAC, BCA, CAB, CBA].
