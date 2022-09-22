public class StackUse {
    public static void main(String[] args) throws StackFullException
    {
        Stack_using_array stack = new Stack_using_array();
        for (int i = 1; i <= 5; i++)
        {
            stack.push(i);
        }
        while (!stack.isEmpty())
        {
            try
            {
                System.out.println(stack.pop());
            }
            catch (StackEmptyException E)
            {
                // never reach here;
            }
        }
    }
}
