class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class problem2 {

    public static Node sortAlternatingList(Node head) {
        if (head == null || head.next == null) return head;

        
        Node asc = head;
        Node desc = head.next;

        Node a = asc;
        Node d = desc;
        Node curr = head.next.next;

        boolean toggle = true;

        while (curr != null) {
            if (toggle) {
                a.next = curr;
                a = a.next;
            } else {
                d.next = curr;
                d = d.next;
            }
            curr = curr.next;
            toggle = !toggle;
        }

        a.next = null;
        d.next = null;


        Node reversedDesc = reverseList(desc);

        return mergeSortedLists(asc, reversedDesc);
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private static Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
    }

    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] input1 = {13, 99, 21, 80, 50};
        Node head1 = createList(input1);
        System.out.print("Sorted List 1: ");
        printList(sortAlternatingList(head1)); 
    }
}
