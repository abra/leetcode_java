package leetcode.problems.easy.p0021;

public class Solution {

  // Leetcode problem #21. Merge Two Sorted Lists
  public ListNode mergeSortedLinkedListsIteratively(ListNode list1, ListNode list2) {

    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    ListNode result = new ListNode();
    ListNode current = result;
    while (list1 != null || list2 != null) {
      if (list1 == null) {
        current.next = list2;
        list2 = list2.next;
      } else if (list2 == null) {
        current.next = list1;
        list1 = list1.next;
      } else if (list1.val < list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }
    return result.next;
  }
}

