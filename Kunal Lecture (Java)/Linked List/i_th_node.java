import java.util.Scanner;
public class i_th_node
{
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
    public static void printIthNode(Node<Integer> head , int i)
    {
        int position = 0;
        Node<Integer> tmp = head;

        while(tmp != null && position < i)
        {
            tmp = tmp.next;
            position++;
        }
        if (tmp != null)
        {
            System.out.println(tmp.data);
        }
    }
    public static void main(String[] args)
    {
        Node<Integer> head = createLinkedList();
        System.out.println("Enter the ith node : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIthNode(head , n);
    }
}
