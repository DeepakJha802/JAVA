public class message5 {
    public static void main(String[] args) {

        message();
    }

    static void message ()
    {
        System.out.println("Hello Deepak");
        message1();
    }

    static void message1()
    {
        System.out.println("Hello Deepak");
        message2();
    }

    static void message2 ()
    {
        System.out.println("Hello Deepak");
        message3();
    }

    static void message3 ()
    {
        System.out.println("Hello Deepak");
        message4();
    }

    static void message4 ()
    {
        System.out.println("Hello Deepak");
    }
}

// Here , One function call another function.
// For eg, message function call message1 function and message1 funtion call message2 function and so...................
// First the main function gets called.
// When one function is call another function this method is call recursion.
