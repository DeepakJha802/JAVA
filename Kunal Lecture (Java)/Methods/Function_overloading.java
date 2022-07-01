public class Function_overloading {
    public static void main(String[] args) {
        fun(55);  // If we do not pass any parameter then we get error that is called ambiguity.
        fun("Deepak");

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}

// Function overloading basically happens two or more function have same name and same no of arguments or same type of arguments.
// They can exits if the parameter are different.
//
