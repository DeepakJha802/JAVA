// public class linked_list
// {
//     public static void main(String[] args)
//     {
//         Node n1 = new Node(10);
//         System.out.println(n1.data);
//         System.out.println(n1.next);


//     }
// }

public class linked_list
{
    public static <Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        // n4.next = null;

        return n1;
    }
    public static void main(String[] args)
    {
        Node<Integer> head = createLinkedList();

        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
