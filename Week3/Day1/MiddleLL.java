package Week3.Day1;

import java.util.*;

public class MiddleLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        ListNode middle = middleNode(head);

        System.out.println("Middle node value: " + middle.val);

        ad.close();
    }
}