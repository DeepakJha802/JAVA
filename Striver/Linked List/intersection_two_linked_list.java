import java.util.*;

public class intersection_two_linked_list {
    public static Node getIntersectionNode(Node headA, Node headB) {

        Node tmp_a = headA;
        Node tmp_b = headB;

        int size_a = 0 , size_b = 0;

        while (tmp_a != null || tmp_b != null)
        {
            if (tmp_a != null)
            {
                tmp_a = tmp_a.next;
                size_a++;
            }
            if (tmp_b != null)
            {
                tmp_b = tmp_b.next;
                size_b++;
            }
        }

        int size = Math.abs(size_a - size_b);
        tmp_a = headA ; tmp_b = headB;

            if (size_a > size_b)
            {
               while (size > 0)
               {
                   tmp_a = tmp_a.next;
                   size--;
               }
            }
            else
            {
                while (size > 0)
               {
                   tmp_b = tmp_b.next;
                   size--;
               }
            }

        while (tmp_a != tmp_b)
        {
            tmp_a = tmp_a.next;
            tmp_b = tmp_b.next;
        }
        if (tmp_a == null)
        {
            return null;
        }
        else
        {
            return tmp_a;
        }
    }

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First linked list : ");
        Node headA = takeInput();

        System.out.println("Enter the Second linked list : ");
        Node headB = takeInput();

        getIntersectionNode(headA, headB);
    }
}
