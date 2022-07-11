public class String_performance {
    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            str = str + ch;
        }
        System.out.println(str);
    }
}
// But this is not good way to print a to z because the space complexity is increased by every iteration of the loop.
// In every iteration of loop a new object is created.
// Time complexity is :- O(n^2).
