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

public class delete_recursively
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

    public static Node deleteRecursive(Node head , int position)
    {
        if (head == null)
        {
            return head;
        }

        if (position == 0)
        {
            return head.next;
        }

        Node new_head = deleteRecursive(head.next , position - 1);
        head.next = new_head;

        return head;
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

        System.out.println("Enter the position where you want to delete the node : ");
        int position = sc.nextInt();

        head = deleteRecursive(head, position);

        System.out.println("Linked List after inserting new node : ");
        printRecursive(head);
    }
}
