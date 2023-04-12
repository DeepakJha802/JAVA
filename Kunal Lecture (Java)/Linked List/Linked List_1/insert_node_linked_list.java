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

public class insert_node_linked_list
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

    public static Node insert(Node head , int element , int position)
    {
        Node new_node = new Node(element);

        if (position == 0)
        {
            new_node.next = head;
            return new_node;
        }

        else
        {
            int count = 0;
            Node previous_node = head;

            while (count < (position - 1) && previous_node != null)
            {
                count++;
                previous_node = previous_node.next;
            }
            if (previous_node != null)
            {
                new_node.next = previous_node.next;
                previous_node.next = new_node;
            }
            return head;
        }
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

        System.out.println("Enter the element and position where we have to insert : ");
        int element = sc.nextInt();
        int position = sc.nextInt();

        head = insert(head, element, position);
        System.out.println("After inserting in linked list : ");

        print(head);
    }
}
