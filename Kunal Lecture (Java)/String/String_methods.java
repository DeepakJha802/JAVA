import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {

        String str = "Deepak Kumar";

        // str.toCharArray();  // Convert String to char arrays.
        System.out.println(Arrays.toString(str.toCharArray()));

        // str.toLowerCase(); // Convert to lowercase.
        System.out.println(str.toLowerCase());  // Here original object is not changed.
    }
}
