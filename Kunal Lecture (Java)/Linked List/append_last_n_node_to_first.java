import java.util.Scanner;

class Node
{
    int data;
    Node next;                  // To store the reference the next node.

    Node (int data)           // Constructor
    {
        this.data = data;
        next = null;        // Default value of any reference in an any object is null.
    }
}

public class append_last_n_node_to_first
{
    public static Node takeInput()
    {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while (true)
        {
            int data = sc.nextInt();
            if (data == -1)
            {
                break;
            }

            Node currentNode = new Node(data);

            if (head == null)
            {
                head = currentNode;
                tail = currentNode;
            }

            else
            {
                tail.next = currentNode;
                tail = currentNode;    // tail = tail.next;
            }
        }
        return head;
    }

    public static Node appNodetoFirst (Node head , int n)
    {
        if (n == 0 || head == null)
        {
            return head;
        }

        Node fast = head;
        Node slow = head;
        Node initialNode = head;

        for (int i = 0; i < n; i++)
        {
            fast = fast.next;
        }

        while (fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        Node temp = slow.next;
        slow.next = null;
        fast.next = initialNode;
        head = temp;

        return head;
    }

    public static void print(Node head)

    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        System.out.println("Enter the value of n : ");
        int position = sc.nextInt();


        head = appNodetoFirst(head, position);

        System.out.println("After appending linked list : ");

        print(head);
    }
}
