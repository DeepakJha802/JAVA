public class String {
    public static void main(String[] args) {
        String name = "Deepak Jha"; // Here , name is a reference variable of type String.

        String a = "Deepak";
        String b = "Deepak";  // Here, a and b both reference variable are pointing to te same object "deepak" which is in the same String pool.

        a = "Kumar"  // Here, we can not change the object i am createing a new object.

        // But the value of b is remain "Deepak"    

        System.out.println(a);
        System.out.println(b);

    }

}

// String :- Java string is a sequence of character that exist as an object of
// the class java.lang.
// String is immutable in java -- its value can't be changed.
// String is the most commonly used class int the java's class library.
// String Pool :- String pool is nothing but a storage area in Java heap where string literals stores. It is also known as String Intern
// Pool or String Constant Pool. It is just like object allocation.
//
