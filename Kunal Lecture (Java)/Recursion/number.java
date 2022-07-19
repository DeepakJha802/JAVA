
public class number {
    public static void main(String[] args) {

        number(1);
    }

    static void number(int n)
    {
        System.out.println(n);
        number1(2);
    }

    static void number1(int n)
    {
        System.out.println(n);
        number2(3);
    }

    static void number2(int n)
    {
        System.out.println(n);
        number3(4);
    }

    static void number3(int n)
    {
        System.out.println(n);
        number4(5);
    }

    static void number4(int n)
    {
        System.out.println(n);
    }
}

// Whlile the function is not finished executing it will remain in stack.
// First main function gets called. So the main function go first in the stack. And the last function that will come out of the stack.
// When a function is staying inside a stack it basically means that function call is currently going on.


// When the function finished executing it will removed from the stack. And the flow of program is restored to where that function was called.
// When a function call itself that is called recursion.
