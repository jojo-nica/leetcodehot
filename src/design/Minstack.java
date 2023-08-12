package design;

import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
public class MinStack {
  Stack<Integer> stack;
  Stack<Integer> minStack;
  public MinStack() {
      stack=new Stack<>();
      minStack=new Stack<>();
  }

  public void push(int val) {
      stack.push(val);
      if(minStack.isEmpty())
      {
        minStack.push(val);
      }
      else
      {
        if(val<=minStack.peek()) minStack.push(val);
      }

  }

  public void pop() {
      int temp = stack.pop();
      if(temp==minStack.peek()) minStack.pop();
  }

  public int top() {
      return  stack.peek();
  }

  public int getMin() {
      return  minStack.peek();
  }
}
