import java.util.Stack;

public class P232_ImplementQueueUsingStacks {

    public static class MyQueue {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            int realloc = stack.size();
            for (int i = 0; i < realloc; i++) {
                temp.add(stack.pop());
            }
            stack.add(x);
            for (int i = 0; i < realloc; i++) {
                stack.add(temp.pop());
            }
        }

        public int pop() {
            return stack.pop();
        }

        public int peek() {
            return stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }

    }

}
