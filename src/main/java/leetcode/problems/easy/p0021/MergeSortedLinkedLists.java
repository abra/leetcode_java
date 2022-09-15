package leetcode.problems.easy.p0021;

public class MergeSortedLinkedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = new Solution().mergeSortedLinkedListsRecursively(l1, l2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();
    }

}

// https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {

    public ListNode mergeSortedLinkedListsRecursively(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeSortedLinkedListsRecursively(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeSortedLinkedListsRecursively(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeSortedLinkedListsIteratively(ListNode l1, ListNode l2) {

        var curr = new ListNode(0);
        var temp = curr;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return temp.next;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public String toString() {
        return "val: " + this.val + ", next: [" + this.next + "]";
    }
}

