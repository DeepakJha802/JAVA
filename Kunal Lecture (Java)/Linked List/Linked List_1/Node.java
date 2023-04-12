
// public class Node {

//     int data;
//     Node next; //To store the reference the next node.

//     Node (int data)  // Constructor
//     {
//         this.data = data;
//         next = null;        // Default value of any reference in an any object is null.
//     }
// }

public class Node<T> {

    T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
        next = null;
    }
}
