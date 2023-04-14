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

public  class insert_recursively
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

    public static Node insertRecursive(Node head , int value , int position)
    {
        if (head == null && position > 0)
        {
            return head;
        }

        if (position == 0)
        {
            Node new_node =  new Node(value);
            new_node.next = head;

            return new_node;
        }
        else
        {
            Node small_head = insertRecursive(head.next , value , position - 1);

            head.next = small_head;

            return head;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        System.out.println("Enter the value and position where you have to insert the new node : ");
        int value = sc.nextInt();
        int position = sc.nextInt();

        head = insertRecursive(head, value , position);

        System.out.println("Linked List after inserting new node : ");
        printRecursive(head);
    }
}
