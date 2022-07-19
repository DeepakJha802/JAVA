public class recursion {
    public static void main(String[] args) {

        print(1);
    }

    // Write a function that takes in a number and prints it.
    // print first 5 numbers: 1 2 3 4 5 

    static void print(int n)
    {
        System.out.println(n);
        print(n + 1);
    }

}

// When a function call itself many time that is called recursion.

