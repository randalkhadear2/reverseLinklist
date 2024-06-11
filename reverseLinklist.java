class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class reverseLinklist {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;              
            prev = current;                   
            current = nextNode;               
        }
        return prev; 
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        reverseLinklist solution = new reverseLinklist();

        ListNode reversedHead = solution.reverseList(head);

        current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}