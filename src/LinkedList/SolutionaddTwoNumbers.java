package LinkedList;

import java.util.ArrayList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionaddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode();
    ListNode temp = dummy;
    int t=0;
    while(l1!=null || l2!=null || t!=0)
    {
      if(l1!=null)
      {
        t+=l1.val;
        l1=l1.next;
      }
      if(l2!=null)
      {
        t+=l2.val;
        l2=l2.next;
      }
      temp.next=new ListNode(t%10);
      temp=temp.next;
      t=t/10;
    }
    return  dummy.next;
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
