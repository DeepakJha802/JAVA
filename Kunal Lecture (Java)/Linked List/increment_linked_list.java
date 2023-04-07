public class increment_linked_list {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;
    }

    public static void increment(Node<Integer> head)
    {
        head.data++;
    }

    public static void print(Node<Integer> head)
    {
        // System.out.println("Print " + head);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        Node<Integer> head = createLinkedList();

        increment(head);
        print(head);
        System.out.println();
        // print(head);
    }
}
