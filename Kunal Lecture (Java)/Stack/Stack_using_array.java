public Stack_using_array
{
    private int data[];
    private int top_index;  // This is the index of top most element of the stack.

    public Stack_using_array ()
    {
        data = new int [10];
        top_index = -1;
    }

    public Stack_using_array (int size)
    {
        data = new int [size];
        top_index = -1;
    }

    public boolean isEmpty()
    {
        if (top_index == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int size()
    {
        return (top_index + 1);
    }

    public int top() throw StackEmptyException
    {
        if (size() == 0)    // If the stack is empty
        {
            StackEmptyException E = new StackEmptyException();   // Here we can throw a StackEmptyException and the Exception class will be super class.
            throw E;
        }
        else
        {
            return data[top_index];
        }
    }

    public void push(int element) throw StackFullException
    {
        if (size() == data.length)      // If the Stack is full
        {
            StackFullException F = new StackFullException();         // We have to throw a StackFullException and the Exception class will be super class.
            throw F;
        }
        else
        {
            top_index++;
            data[top_index] = element;
        }
    }

    public int pop() throw StackEmptyException
    {
        if (size() == 0)    // If the stack is empty.
        {
            StackEmptyException E = new StackEmptyException();       // Here we can throw a StackEmptyException and the Exception class will be super class.
            throw E;
        }
        else
        {
            int temp = data[top_index]
            top_index--;
            return temp;
        }
    }
}
