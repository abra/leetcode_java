package leetcode.problems.medium.p0002;

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    if (l1.next == null && l2.next == null && l1.val + l2.val < 10) {
      return new ListNode(l1.val + l2.val);
    }

    ListNode listNode = new ListNode();
    ListNode current = listNode;

    ListNode a = l1;
    ListNode b = l2;

    while (a != null || b != null) {
      int num = current.val;

      if (a != null) num += a.val;
      if (b != null) num += b.val;

      if (num >= 10) {
        current.val = num % 10;
        current.next = new ListNode(num / 10);
      } else {

        current.val = num;

        if ((a != null && a.next != null) || (b != null && b.next != null)) {
          current.next = new ListNode(0);
        }

      }

      current = current.next;
      a = (a != null) ? a.next : null;
      b = (b != null) ? b.next : null;
    }

    return listNode;
  }
}

