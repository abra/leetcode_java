package leetcode.problems.easy.p0021;

public class Solution {

//  public ListNode mergeSortedLinkedListsRecursively(ListNode l1, ListNode l2) {
//
//    if (l1 == null) return l2;
//    if (l2 == null) return l1;
//
//    if (l1.val < l2.val) {
//      l1.next = mergeSortedLinkedListsRecursively(l1.next, l2);
//      return l1;
//    } else {
//      l2.next = mergeSortedLinkedListsRecursively(l1, l2.next);
//      return l2;
//    }
//  }

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

/*
var mergeTwoLists = function(list1, list2) {
   let newList = new ListNode()
   let currNew = newList
   let cur1 = list1
   let cur2 = list2

   while(cur1 || cur2){

       if(cur1 && !cur2){
           newList.next = cur1
           break;
       }else if(!cur1 && cur2){
           newList.next = cur2
           break;
       }else if( cur1.val <= cur2.val){
           newList.next = cur1
           cur1 = cur1.next
       }else{
           newList.next = cur2
           cur2 = cur2.next
       }

       newList = newList.next
   }

   return currNew.next
};

 */

