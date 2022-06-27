import java.util.Arrays;
import java.util.Scanner;

public class L_S_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(Search(str, ch));

        System.out.println(Arrays.toString(str.toCharArray()));

        // str.toCharArray() :- This is convert a string to a char array.
        // Arrays.toString() :- Returns a string representation of the contents of the specified array.
    }

    static boolean Search(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
}
