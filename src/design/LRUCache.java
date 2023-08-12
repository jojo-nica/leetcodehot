package design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author nica
 * @version 1.0
 */
public class LRUCache {
  int capacity;
  Map<Integer,Node> map;
  DoubleList doubleList;
  public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        doubleList=new DoubleList();
  }

  public int get(int key) {
        Node res = map.get(key);
        if(res==null) return -1;
        if(!doubleList.isFirst(res)) doubleList.moveFirst(res);
        return  res.val;

  }

  public void put(int key, int value) {
        Node node = map.get(key);
        if(node!=null)
        {
          node.val=value;
          if(!doubleList.isFirst(node)) doubleList.moveFirst(node);
        }
        else
        {
          Node newNode = new Node(key,value);
          if(doubleList.size==capacity)
          {
            Node removed = doubleList.removeLast();
            map.remove(removed.key);
          }
          doubleList.addFirst(newNode);
          map.put(key,newNode);
        }
  }

  class  Node
  {
    int key,val;
    Node prev,next;
    Node() {}
    Node(int key,int val)
    {
      this.key=key;
      this.val=val;
    }
  }
  class DoubleList
  {
    int size;
    Node head = new Node();
    Node tail = new Node();

    DoubleList()
    {
      head.next=tail;
      tail.prev=head;
    }
    public  void addFirst(Node node)
    {
      node.next=head.next;
      head.next.prev=node;
      node.prev=head;
      head.next=node;
      size++;
    }
    public  boolean isFirst(Node node)
    {
      if(node.prev==head) return true;
      else return  false;
    }

    public  void remove(Node node)
    {
      node.prev.next=node.next;
      node.next.prev=node.prev;
      node.next=null;
      node.prev=null;
      size--;
    }
    public  Node removeLast()
    {
      Node last = tail.prev;
      if(last!=head)
      {
        remove(last);
        return last;
      }
      return  null;
    }

    public  void moveFirst(Node node)
    {
      remove(node);
      addFirst(node);
    }

    public  int getSize()
    {
      return  size;
    }


  }
}
