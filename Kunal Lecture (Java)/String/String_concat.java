import java.util.ArrayList;

public class String_concat {

    public static void main(String[] args) {

        System.out.println('a' + 'b');  // First convert to ascii value than add them.

        System.out.println("a" + "b");  // Both string so directly merged.

        System.out.println('a' + 3);     // ASCII value of a plus 3.

        System.out.println((char)('a' + 3));   // ASCII value of a then add 3 and print the character which value are both sums.

        System.out.println("a" + 1);  // First 1 is convert to string by internally calling the .toString() methods, and then both are merged.
                                       // answer :- a1

        System.out.println("deepak" + new ArrayList<>());  // Both are merged (answer :- deepak[])

        System.out.println("deepak" + new Integer(56));  // Both are merged (answer :- deepak56)

        // System.out.println(new Integer(56) + new ArrayList<>());
        // This is give error because The operator plus(+) in java it's only defined for primitives and any one of these value is a string.
        // For eg.

        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans);  // now it does not give error beacuse one value of type string.
    }
}
// Operator minus(-) can't work with string. It's only work with primitives and other mathatical expression.

// Operator overloading :- It means we can make operator as any type like we can use plus(+) operator as multiplication(*) operator.

// Operator overloading does't supported by java. But in python & c++ are supported.
// But one exception in java in String (+) is used as operator overloading. Because it concatenate two string.
