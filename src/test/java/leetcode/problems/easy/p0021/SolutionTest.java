package leetcode.problems.easy.p0021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/merge-two-sorted-lists/
@DisplayName("LeetCode Problem #21. Merge Two Sorted Lists")
class SolutionTest {

  private static ListNode arrayToListNode(int[] numbers) {

    if (numbers.length == 1) {
      return new ListNode(numbers[0]);
    }

    ListNode l = new ListNode();

    ListNode current = l;

    for (int i = 0; i < numbers.length - 1; i++) {
      current.val = numbers[i];
      current.next = new ListNode(numbers[i + 1]);
      current = current.next;
    }

    return l;
  }

  @Test
  @DisplayName("Input: list1 = [1,2,4], list2 = [1,3,4]. Should return: [1,1,2,3,4,4]")
  void mergeSortedLinkedListsRecursively1() {
    ListNode l1 = arrayToListNode(new int[]{1, 2, 4});
    ListNode l2 = arrayToListNode(new int[]{1, 3, 4});
    ListNode result = new Solution().mergeSortedLinkedListsIteratively(l1, l2);
    ListNode expected = arrayToListNode(new int[]{1, 1, 2, 3, 4, 4});

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: list1 = [], list2 = []. Should return: []")
  void mergeSortedLinkedListsRecursively2() {
    ListNode l1 = arrayToListNode(new int[]{});
    ListNode l2 = arrayToListNode(new int[]{});
    ListNode result = new Solution().mergeSortedLinkedListsIteratively(l1, l2);
    ListNode expected = arrayToListNode(new int[]{});
  }

  @Test
  @DisplayName("Input: list1 = [], list2 = [0]. Should return: [0]")
  void mergeSortedLinkedListsRecursively3() {
    ListNode l1 = arrayToListNode(new int[]{});
    ListNode l2 = arrayToListNode(new int[]{0});
    ListNode result = new Solution().mergeSortedLinkedListsIteratively(l1, l2);
    ListNode expected = arrayToListNode(new int[]{0});
  }

  @Test
  @DisplayName("Input: list1 = [4,1,0,5], list2 = [9,3]. Should return: [4,1,0,5,9,3]")
  void mergeSortedLinkedListsRecursively4() {
    ListNode l1 = arrayToListNode(new int[]{4, 1, 0, 5});
    ListNode l2 = arrayToListNode(new int[]{9, 3});
    ListNode result = new Solution().mergeSortedLinkedListsIteratively(l1, l2);
    ListNode expected = arrayToListNode(new int[]{4, 1, 0, 5, 9, 3});

    assertEquals(expected, result);
  }

}