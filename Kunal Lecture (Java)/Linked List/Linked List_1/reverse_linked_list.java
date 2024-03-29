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


public class reverse_linked_list
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

    public static void reverseLinkedlist (Node head)
    {
        if (head == null)
        {
            return;
        }
        reverseLinkedlist(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        System.out.println("Linked List in reverse order : ");
        reverseLinkedlist(head);
    }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev;
    }
}
