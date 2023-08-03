package LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutiondeleteDuplicates {
  class ListNode
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
  public ListNode deleteDuplicates(ListNode head) {
      if(head==null) return head;
      ListNode prev = head;
      ListNode cur = head.next;
      int curr = prev.val;
      while (cur!=null)
      {
        if(curr == cur.val)
        {
          ListNode temp = cur.next;
          cur.next=null;
          prev.next=temp;
          cur = temp;
        }
        else
        {
          curr = cur.val;
          prev=cur;
          cur=cur.next;
        }
      }
      return head;
  }

}
