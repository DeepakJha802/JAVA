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

public class eleminate_duplicate_linked_list
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

    public static Node duplicateDelete(Node head)
    {
        if (head == null)
        {
            return head;
        }
        Node currNode = head;

        while (currNode.next != null)
        {
            if (currNode.data == (currNode.next.data))
            {
                currNode.next = currNode.next.next;
            }
            else
            {
                currNode = currNode.next;
            }
        }
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

        head = duplicateDelete(head);

        System.out.println("After deleting duplicate in linked list : ");

        print(head);
    }
}
