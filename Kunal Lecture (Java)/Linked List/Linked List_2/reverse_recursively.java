import java.util.*;

class Node
{
    int data;
    Node next;

    Node (int data)
    {
        this.data = data;
        next = null;
    }
}


public class reverse_recursively
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

    public static Node reverseRecursive(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        // Node new_head = reverseRecursive(head.next);
        // head.next.next = head;  // 5 -> 4
        // head.next = null;       // 4 -> null

        Node new_head = reverseRecursive(head.next);
        Node tail = new_head;
        while (tail.next != null)
        {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return new_head;
    }

    public static void printRecursive(Node head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data + " ");

        printRecursive(head.next);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        head = reverseRecursive(head);

        System.out.println("Linked List After Reverse : ");
        printRecursive(head);
    }
}
