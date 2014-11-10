package stack;

import java.util.Stack;

/**
 * Created by fuxie on 2014/11/10  15:21.
 */
public class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> min_stack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if (min_stack.isEmpty() || min_stack.peek() >= x) {
            min_stack.push(x);
        }
    }

    public void pop() {
        int top = stack.pop();
        if (min_stack.peek() == top) {
            min_stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
