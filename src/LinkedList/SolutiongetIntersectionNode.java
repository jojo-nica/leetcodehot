package LinkedList;

import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class SolutiongetIntersectionNode {
  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode fast = headA;
      ListNode slow = headB;
      while (fast != null || slow!=null)
      {
        if(fast==slow)return  fast;
        if(fast!=null) fast=fast.next;
        else fast=headB;
        if(slow!=null)  slow=slow.next;
        else  slow=headA;
      }
      return  null;
  }
  class  ListNode
  {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val)
    {
      this.val=val;
    }
    ListNode(int val, ListNode next)
    {
      this.val=val;
      this.next=next;
    }

  }
}
