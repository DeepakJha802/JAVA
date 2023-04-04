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
    public static Node<Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        // System.out.println(" n1 " + n1 + " Data " + n1.data + " Next " + n1.next);
        n2.next = n3;
        // System.out.println(" n2 " + n2 + " Data " + n2.data + " Next " + n2.next);
        n3.next = n4;
        // System.out.println(" n3 " + n3 + " Data " + n3.data + " Next " + n3.next);
        n4.next = null;
        // System.out.println(" n4 " + n4 + " Data " + n4.data + " Next " + n4.next);

        return n1;
    }

    public static void print(Node<Integer> head)
    {
        // System.out.println("Print " + head);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }

    public static void main(String[] args)
    {
        Node<Integer> head = createLinkedList();

        // System.out.println("Main " + head);

        print(head);

        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
