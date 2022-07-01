public class Array {
    public static void main(String[] args) {

        int []arr;  // Here we declare the array . arr is geeting defined in stack. This things happend in compile time.

        arr = new int[/*size*/n];  // Actually here the object is being created in heap memory. This is also called initialisation.\

        //  This things happend in run time. and this things known as dynamics memory allocation.

        //  arr is called reference variable and the value in the arr is called objects.

        int [] arr = new int[n];          // We can also write this way.

        //  When we don't initialise the array. Then by defalut in int data type of array , all the indices initialise with zero.

        //  In the String type of array by defalut all the indices initialise with null character.
    }

}

// Array :- an array is basiclly a collection of the data types it can either be primitive or objects and even complex data types.
// In C and C++ array has continuous memory allocation but in java case is different

//  New :- new is a keyword basically it is used to create an object.

// Null :- null is not a keyword. null basically means that it's like a special Literals of null type we can cast in any reference  tyep.
// But we can't create a null type , we can not declare to this as a variable type. we can not assign it to any primitives.

// Some Important Points of Arrays  :-

// 1. Arrays objects are in heap.
// 2. Heap objects are not continuous.
// 3. Dynamics memory allocations occurs in arrays.

//  Hence ,
//  In Java Object May not be continuous --> Depends on JVM.

//  String are immutable in java and arrays are mutable in java.
// mutable means we can change the objects 
