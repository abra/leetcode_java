package leetcode.problems.medium.p0002;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/add-two-numbers/
@DisplayName("Leetcode Problem #2. Add Two Numbers (Number as ListNode)")
class SolutionTest {

  @Test
  @DisplayName("Add ListNode(2, 4, 3) and ListNode(5, 6, 4). Should return ListNode(7, 0, 8)")
  void addTwoNumbers1() {
    ListNode l1 = arrayToListNode(new int[]{2, 4, 3});
    ListNode l2 = arrayToListNode(new int[]{5, 6, 4});
    ListNode result = new Solution().addTwoNumbers(l1, l2);
    ListNode expected = arrayToListNode(new int[]{7, 0, 8});

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Add ListNode(9, 9, 9, 9, 9, 9, 9) and ListNode(9, 9, 9, 9). Should return ListNode(8, 9, 9, 9, 0, 0, 0, 1)")
  void addTwoNumbers2() {
    ListNode l1 = arrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
    ListNode l2 = arrayToListNode(new int[]{9, 9, 9, 9});
    ListNode result = new Solution().addTwoNumbers(l1, l2);
    ListNode expected = arrayToListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Add ListNode(5) and ListNode(5). Should return ListNode(0, 1)")
  void addTwoNumbers3() {
    ListNode l1 = arrayToListNode(new int[]{5});
    ListNode l2 = arrayToListNode(new int[]{5});
    ListNode result = new Solution().addTwoNumbers(l1, l2);
    ListNode expected = arrayToListNode(new int[]{0, 1});

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Add ListNode(0) and ListNode(0). Should return ListNode(0)")
  void addTwoNumbers4() {
    ListNode l1 = arrayToListNode(new int[]{0});
    ListNode l2 = arrayToListNode(new int[]{0});
    ListNode result = new Solution().addTwoNumbers(l1, l2);
    ListNode expected = arrayToListNode(new int[]{0});

    assertEquals(expected, result);
  }

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
}
