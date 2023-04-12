import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;       // Default is always null.
    }
}

public class pallindrome_linked_list {
    private static Node reverseLinkedlist (Node head) {
        Node current_node = head;
        Node prev = null;
        Node fwd = null;

        while (current_node != null) {
            fwd = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = fwd;
        }
        return prev;
    }
    public static boolean isPalindrome (Node head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }

        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node secondHead = slow.next;
        slow.next = null;
        secondHead = reverseLinkedlist(secondHead);

        Node firstSubList = secondHead;
        Node secondSubList = head;

        while (firstSubList != null)
        {
            if (firstSubList.data != secondSubList.data)
            {
                return false;
            }

            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }

        firstSubList  = head;
        secondSubList = reverseLinkedlist(secondHead);

        while (firstSubList.next != null)
        {
            firstSubList = firstSubList.next;
        }

        firstSubList.next = secondSubList;

        return true;
    }

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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the linked list : ");
        Node head = takeInput();

        System.out.println(isPalindrome(head));
    }
}
