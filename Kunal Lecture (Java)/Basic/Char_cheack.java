import java.util.Scanner;

public class Char_cheack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Char ch = in.next().trim().charAt(0);
        if (ch > 'a' && ch < 'z')
        {
            System.out.println("Lowercase.");
        }
        else
        {
            System.out.println("Uppercase.");
        }

    }

}

// L - 8
//
// .trim() :- .trim() Basically means remove all the extra spaces that are at the end of the words.

// .charAt() :- when we call this function then this is print the i th. index of the string. this is returning the character type.
