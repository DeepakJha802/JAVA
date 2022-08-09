import java.util.Scanner;

public class String_Buffer {
    public static void main(String[] args) {
        String s = "Deepak";
        StringBuffer str = new StringBuffer(s);
        str.setCharAt(2, 'D');
        str.append("Deepak");
        System.out.println(str);
    }

}

// String Buffer :- If we want the mutable string then we can use the class of String Buffer.
// This is mutable. here any change will happend in same string so no new string object will be created.
//
