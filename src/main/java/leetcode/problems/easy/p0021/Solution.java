package leetcode.problems.easy.p0021;

public class Solution {

  public ListNode mergeSortedLinkedListsIteratively(ListNode l1, ListNode l2) {

    if (l1.next == null && l2.next == null) {
      return new ListNode();
    }

    ListNode head = new ListNode(0);
    ListNode node = head;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        node.next = l1;
        l1 = l1.next;
      } else {
        node.next = l2;
        l2 = l2.next;
      }
      node = node.next;
    }

    if (l1 != null) node.next = l1;
    if (l2 != null) node.next = l2;
    return head.next;
  }
}

