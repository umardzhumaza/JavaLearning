package collections.arrayList.stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //first in last out & last in first out
        stack.push(5);
        stack.push(3);
        stack.push(1);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
