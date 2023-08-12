package design;

import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
public class CQueue {
  Stack<Integer> stack;
  Stack<Integer> temp;
  public CQueue() {
      stack=new Stack<>();
      temp = new Stack<>();
  }

  public void appendTail(int value) {
        stack.push(value);
  }

  public int deleteHead() {
    if(!temp.isEmpty()) return temp.pop();
    if(stack.isEmpty()) return -1;
    while(!stack.isEmpty())
    {
      temp.push(stack.pop());
    }
    return temp.pop();
  }
}
