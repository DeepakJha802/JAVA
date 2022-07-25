public class recursion {
    public static void main(String[] args) {

        print(1);
    }

    // Write a function that takes in a number and prints it.
    // print first 5 numbers: 1 2 3 4 5

    static void print(int n)
    {
        if (n == 5)   // Base condition.
        {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);
        //  This function is call itself.
        // Currently this function is not stoping anywhere.
        // If we calling a function again and again we can traet as a seprate function call in the stack. So it will also take memory space sepratly.
    }
}

// When a function call itself many time that is called recursion.

// Base Condition :- It is a condition where are recursion will stop making new calls.

// Stack overflow :- When Memory of computer will exceed the limit than we get stack overflow error.


// Why Recursion ??

// 1. It Helps us to solving bigger/complex problem in a simple way.
// 2. You can convert recursion solution into iteration & vice versa.
// 3. Space complexity is not constant Beacuse of recursive calls.
// 4. It helps us in breaking down bigger problems into smaller problems.

// What is Recurence Relation :- A recurrence relation is an equation which represents a sequence based on some rule.
// It helps in finding the subsequent term (next term) dependent upon the preceding term (previous term).

// For eg, F(n) = F(n - 1) + F(n - 2)  (nth. fibonacci no)

// There are two types of recursion problems :-
// 1. Linear  (Like, Factorial of a no , and fibonacci nos)
// 2. Divide and Conquer (like Bnary Search)

// 1. Linear Recurences Relation :- F(n) = F(n - 1) + F(n - 2)  (nth. fibonacci no)
// 2. Divide and Conquer Recurences Relation :- F(n) = F(n / 2) + O(1)   (Binary Search)
