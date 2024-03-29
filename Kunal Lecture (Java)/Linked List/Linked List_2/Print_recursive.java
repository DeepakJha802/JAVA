
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

public class Print_recursive
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

    public static void printRecursive(Node head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data + " ");

        printRecursive(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        printRecursive(head);
    }
}
