package LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionisPalindrome {
  public boolean isPalindrome(ListNode head) {
    if(head==null) return  false;
    if(head.next==null)return  true;
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!=null && fast.next.next!=null )
    {
      fast=fast.next.next;
      slow=slow.next;
    }
    ListNode res = reverse(slow.next);
    while(res!=null)
    {
      if(res.val!=head.val) return  false;
      res=res.next;
      head=head.next;
    }
    return  true;
  }
  ListNode reverse(ListNode head)
  {
    ListNode prev = null;
    ListNode cur = head;
    while(cur!=null)
    {
      ListNode temp = cur.next;
      cur.next = prev;
      prev = cur;
      cur = temp;
    }
    return  prev;
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
