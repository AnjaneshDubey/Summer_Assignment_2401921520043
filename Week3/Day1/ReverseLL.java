package Week3.Day1;
import java.util.*;
public class ReverseLL {
    public static class ListNode{
        int val;
        ReverseLL.ListNode next;
        ListNode(int val)
        {
            this.val = val;

        }}
        public static ListNode reverseList(ListNode head) {
          ListNode crr = head;
          ListNode prev = null;
          while(crr != null) {
              ListNode next = crr.next;
              crr.next = prev;
              prev = crr;
              crr = next;
          }
          return prev;
        }
        public static void printList(ListNode head) {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner ad = new Scanner(System.in);

            System.out.print("Enter number of nodes: ");
            int n = ad.nextInt();

            if (n <= 0) {
                System.out.println("List is empty.");
                return;
            }

            System.out.println("Enter node values:");

            ListNode head = new ListNode(ad.nextInt());
            ListNode temp = head;

            for (int i = 1; i < n; i++) {
                temp.next = new ListNode(ad.nextInt());
                temp = temp.next;
            }

            System.out.print("Original List: ");
            printList(head);

            head = reverseList(head);

            System.out.print("Reversed List: ");
            printList(head);

            ad.close();
        }
}
