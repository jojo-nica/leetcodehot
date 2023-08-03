package LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionreverseKGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode prev = dummy;
        ListNode end = dummy;
        while (end.next!=null)
        {
          for(int i=0;i<k && end!=null;i++)end=end.next;
          if(end==null) break;;
          ListNode start = prev.next;
          ListNode next = end.next;
          end = null;
          prev.next=reverse(start);
          start.next=next;
          prev = start;
          end=prev;
        }
        return  dummy.next;
  }
  public  ListNode  reverse(ListNode head)
  {
    ListNode prev = null;
    ListNode cur = head;
    while(cur!=null)
    {
      ListNode temp = cur.next;
      cur.next=prev;
      prev = cur;
      cur = temp;
    }
    return  prev;
  }

  class ListNode
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
