package LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionCycle {
  public boolean hasCycle(ListNode head) {
    if(head==null) return  false;
      ListNode fast=head;
      ListNode slow = head;
      while(fast.next!=null)
      {
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast) return  true;
      }
      return  false;
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
    ListNode(int val,ListNode next)
    {
      this.val=val;
      this.next=next;
    }


  }
}
