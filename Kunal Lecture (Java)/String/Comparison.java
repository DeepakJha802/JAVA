public class Comparison {
    public static void main(String[] args) {

        String a = "Deepak";
        String b = "Deepak";
        System.out.println(a == b);  // a == b (comparator)
        // Here, both are pointing to the same object and value of both string is also same. that's why answer is true.


        String x = new String("Deepak");       // Here, we are explicitly create a new object.
        String y = new String("Deepak");       // Object are create outside the string pool but inside the heap memory.
        // Here, Value of both the string are same but both are pointing to the different objects.
        System.out.println(x == y);    // answer is false. beacuse both are pointing to the different object.


        String i = "Jha";
        String j = "Jha";
        System.out.println(i.equals(j)); // We cheack the value of both string are equal or not.
        // here, equals is the method.
    }
}
// Anythigs we print in println is called .toString() methods.
