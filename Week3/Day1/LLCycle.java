package Week3.Day1;
import java.util.*;
public class LLCycle {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val = val;

        }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast!=null && fast.equals(slow))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = ad.nextInt();

        if (n <= 0) {
            System.out.println("Has Cycle: false");
            return;
        }

        System.out.println("Enter node values:");

        ListNode head = new ListNode(ad.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(ad.nextInt());
            temp = temp.next;
        }
        System.out.print("Enter position to create cycle (-1 for no cycle): ");
        int pos = ad.nextInt();

        if (pos >= 0) {
            ListNode cycleNode = head;
            for (int i = 0; i < pos; i++) {
                cycleNode = cycleNode.next;
            }
            temp.next = cycleNode;
        }
        System.out.println(hasCycle(head));

        ad.close();
    }

}
