public class String_Builder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            str.append(ch);
        }
        System.out.println(str.toString());
    }

}
// String Builder is a data type of string that can change the object without create a new object.
// String Builder only one object is made and changes is made are done on that object only.
// Also the reference is same of and it is not changed. in string builder.
// So String Builder is mutable.

